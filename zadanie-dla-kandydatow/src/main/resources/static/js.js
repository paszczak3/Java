$(document).ready(function(){

    var $newItemButton = $('#newItemA');
    $('#newUserForm').hide();
    $newItemButton.show();

    $('#newItemA').on('click',function(){
        $newItemButton.hide();
        $('#newUserForm').show();
    });

    $('#newUserForm').on('submit',function() {
        $('#newItemA').show();
        $('#newUserForm').hide();
    });


    var $showDeleteForm = $('#showDeleteForm');
    var $deleteForm = $('#deleteForm');
    $deleteForm.hide();

    $showDeleteForm.on('click', function () {
       $deleteForm.show();
       $showDeleteForm.hide();
    });

    $deleteForm.on('submit', function () {
       $deleteForm.hide();
       $showDeleteForm.show();
    });

    var $showEditForm = $('#showEditForm');
    var $editUserForm = $('#editUserForm');
    $editUserForm.hide();

    $showEditForm.on('click', function () {
       $editUserForm.show();
       $showEditForm.hide();
    });

    $editUserForm.on('submit', function () {
       $editUserForm.hide();
       $showEditForm.show();
    });


    var $showUserGroup = $('#showUserGroup');
    var $userGroup = $('#userGroup');
    $userGroup.hide();

    $showUserGroup.on('click', function () {
       $userGroup.show();
       $showUserGroup.hide();
    });

    $userGroup.on('submit', function () {
       $userGroup.hide();
       $showUserGroup.show();
    });


    var $showAddUserToGroup = $('#showAddUserToGroup');
    var $addUserToGroup = $('#addUserToGroup');
    $addUserToGroup.hide();

    $showAddUserToGroup.on('click', function () {
        $addUserToGroup.show();
        $showAddUserToGroup.hide();
    });

    $addUserToGroup.on('submit', function () {
        $addUserToGroup.hide();
        $showAddUserToGroup.show();
    });

    var $showDeleteGroup = $('#showDeleteGroup');
    var $deleteGroup = $('#deleteGroup');
    $deleteGroup.hide();

    $showDeleteGroup.on('click', function () {
        $deleteGroup.show();
        $showDeleteGroup.hide();
    });

    $deleteGroup.on('submit', function () {
        $deleteGroup.hide();
        $showDeleteGroup.show();
    });

    var $showDeleteUserFromGroup = $('#showDeleteUserFromGroup');
    var $deleteUserFromGroup = $('#deleteUserFromGroup');
    $deleteUserFromGroup.hide();

    $showDeleteUserFromGroup.on('click', function () {
        $deleteUserFromGroup.show();
        $showDeleteUserFromGroup.hide();
    });

    $deleteUserFromGroup.on('submit', function () {
        $deleteUserFromGroup.hide();
        $showDeleteUserFromGroup.show();
    });

});