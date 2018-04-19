import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public class Main {
    public static void main(String[] args) throws IOException {
        String urlName;
        String fileName;
        int temp = 0;
        for(int i = 1951; i <= 2016; i++) {
             for(int j = 1; j<=12; j++){
                 urlName = "https://dane.imgw.pl/data/dane_pomiarowo_obserwacyjne/dane_hydrologiczne/dobowe/" + i + "/codz_" + i + "_0" + j + ".zip";
                 if(j >= 10) {
                     urlName = "https://dane.imgw.pl/data/dane_pomiarowo_obserwacyjne/dane_hydrologiczne/dobowe/" + i + "/codz_" + i + "_" + j + ".zip";
                 }
                 fileName = "download"+ temp + ".zip";
                 URL url = new URL(urlName);
                 HttpURLConnection connection = (HttpURLConnection) url.openConnection();
                 connection.setRequestMethod("GET");
                 InputStream in = connection.getInputStream();
                 FileOutputStream out = new FileOutputStream(fileName);
                 copy(in, out, 1024);
                 out.close();
                 temp++;
                 unZipIt(fileName);
             }
        }
    }

    public static void copy(InputStream input, OutputStream output, int bufferSize) throws IOException {
        byte[] buf = new byte[bufferSize];
        int n = input.read(buf);
        while (n >= 0) {
            output.write(buf, 0, n);
            n = input.read(buf);
        }
        output.flush();
    }

    public static void unZipIt(String fileName) {
        try {
            ZipFile zipFile = new ZipFile(fileName);
            Enumeration zipEntries = zipFile.entries();

            while (zipEntries.hasMoreElements()) {
                ZipEntry zipEntry = (ZipEntry) zipEntries.nextElement();
                copyInputStream(zipFile.getInputStream(zipEntry), new BufferedOutputStream(new FileOutputStream(zipEntry.getName())));
            }

            zipFile.close();
            File file = new File(fileName);
            file.delete();
        } catch (IOException ioe) {
            System.err.println("Unhandled exception:");
            ioe.printStackTrace();
            return;
        }
    }

    public static void copyInputStream(InputStream in, OutputStream out)
            throws IOException {
        byte[] buffer = new byte[1024];
        int len;
        while ((len = in.read(buffer)) >= 0) {
            out.write(buffer, 0, len);
        }
        in.close();
        out.close();
    }
}
