<?php
require_once("config.php");
$query = "select * from userlist order by name";
$usr = mysqli_query($dbcnx, $query);
if (!$usr) {
    exit("Klaida" . mysqli_error($usr));
}
$user = mysqli_fetch_array($usr);
echo "Vartotojo vardas - $user[name]<br>";
if (!empty($user['email'])) {
    echo "e-mail - $user[email]<br>";
}
if (!empty($user['url'])) {
    echo "URL - $user[url]<br>";
}
