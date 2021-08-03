<?php
$connect = mysqli_connect('localhost', 'root', '', 'u2_kursai');
if (!$connect) {
    die('Error connect to DataBase');
}
