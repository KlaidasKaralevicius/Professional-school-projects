<?php
require_once("config.php");
$query = "select * from userlist order by name";
$usr = mysqli_query($dbcnx, $query);
if (!$usr) {
    exit ("Klaida" . mysqli_error($usr));
}
while ($user = mysqli_fetch_array($usr)) {
    echo "<a href=userlist.php?id_user=$user[id_user]>$user[name]</a><br>";
}