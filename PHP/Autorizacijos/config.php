<?php
$connect = mysqli_connect('localhost', 'root', 'imone');
if (!$connect) {
    exit ("Deja, DB yra nepasiekiama: " . mysqli_connect_error());
}
