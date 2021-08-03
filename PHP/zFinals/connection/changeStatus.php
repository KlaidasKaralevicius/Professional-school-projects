<?php
require "connect.php";

$projectID = $_GET['projectID'];
$ID = $_GET['ID'];
$newStatus = $_GET['status'];

$changeStatus = mysqli_query($connect, "UPDATE tasks SET status = '$newStatus' WHERE projectID = '$projectID' AND ID = '$ID'");

if ($changeStatus) {
    
    header('Location:' . $_SERVER['HTTP_REFERER']);
} else {
    echo mysqli_error($connect);
}
?>
