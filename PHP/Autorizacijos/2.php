<?php
if (!defined('FIRST')) {
    exit();
}
if (isset($_POST['edit'])) {
    $_POST['name'] = trim($_POST['name']);
    $_POST['passw'] = trim($_POST['passw']);
    $_POST['pass_again'] = trim($_POST['pass_again']);

    if (empty($_POST['name'])) {
        exit();
    }
    if (empty($_POST['name'])) {
        exit ("Laukas vardas neuzpildytas ");
    }
    if (empty($_POST['passw'])) {
        exit ("Vienas is slaptazodzio lauku neuzpildytas");
    }
    if (empty($_POST['pass_again'])) {
        exit("Vienas is slaptazodzio lauku neuzpildytas");
    }
    if ($_POST['passw'] != $_POST['pass_again']) {
        exit ("Slaptazodziai nesutampa");
    }
    if (!empty($_POST['email'])) {
        if (!preg_match("|^[0-9a-z_]+@[0-9a-z_^\.]+\.[a-z]{2,6}$|i", $_POST['email'])) {
            exit('laukas "El_pastas" turi atitikti formata somebody@somwhere.eu');
    }
}
$arr = file($filename);
$linefile = array();
foreach ($arr as $line) {
    $data = explode("::", $line);
    if ($data[0] = $temp['name'][$index]) {
        $linefile[] = $_POST['name'] . "::" . $_POST['passw'] . "::" . $_POST['email'] . "::" . $_POST['url'];
        $temp['password'][$index] = $_POST['passw'];
        $temp['email'][$index] = $_POST['email'];
        $temp['url'][$index] = $_POST['url'];
    } else {
        $linefile[] = trim($line);
    }
}
$fd = fopen($filename, "w");
if (!$fd) {
    exit ("Ivyko klaida, irasant i faila");
}
fwrite ($fd, implode("\r\n", $linefile));
fclose($fd);
}
?>