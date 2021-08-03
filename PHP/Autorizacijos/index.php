<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>

<body>
    <table>
        <form method="POST">
            <tr>
                <td>Vardas:</td>
                <td><input type="text" name="name"></td>
            </tr>
            <tr>
                <td>Slaptazodis:</td>
                <td><input type="password" name="pass"></td>
            </tr>
            <tr>
                <td>Slaptazodis:</td>
                <td><input type="password" name="pass_again"></td>
            </tr>
            <tr>
                <td>El_pastas:</td>
                <td><input type="text" name="email"></td>
            </tr>
            <tr>
                <td>URL:</td>
                <td><input type="text" name="url"></td>
            </tr>
            <tr>
                <td></td>
                <td><input type="submit" value="Registruotis"></td>
            </tr>
        </form>
    </table>

    <?php
    if (!empty($_POST['name'])) {
        $_POST['name'] = trim($_POST['name']);
    }
    if (!empty($_POST['pass'])) {
        $_POST['pass'] = trim($_POST['pass']);
    }
    if (!empty($_POST['pass'])) {
        $_POST['pass_again'] = trim($_POST['pass_again']);
    }
    if (empty($_POST['name']))
        exit();

    if (empty($_POST['name']))
        exit('Laukas "Vardas" neuzpildytas');
    if (empty($_POST['pass']))
        exit('Vienas is slaptazodzio lauku nera uzpildytas');
    if (empty($_POST['name']))
        exit('Vienas is slaptazodzio lauku nera uzpildytas');

    if ($_POST['pass'] != $_POST['pass_again'])
        exit('Slaptazodis nesutampa');

    if (!empty($_POST['email'])) {
        if (!preg_match("|^[0-9a-z_]+@[0-9a-z_^\.]+\.[a-z]{2,6}$|i", $_POST['email'])) {
            exit('laukas "El_pastas" turi atitikti formata somebody@somwhere.eu');
        }
    }
    $link = mysqli_connect("localhost", "root", "imone") or die($link);
    $_POST['name'] = mysqli_real_escape_string($link, $_POST['name']);
    $_POST['pass'] = mysqli_real_escape_string($link, $_POST['pass']);
    $_POST['email'] = mysqli_real_escape_string($link, $_POST['email']);
    $_POST['url'] = mysqli_real_escape_string($link, $_POST['url']);

    require_once("config.php");
    $query = "SELECT COUNT(*) FROM userlist WHERE name = '$_POST[name]'";
    $usr = mysqli_query($link, $query);
    if (!$usr)
        exit("Klaida - " . mysqli_error($usr));
    $total = mysqli_fetch_assoc($usr, 0);
    if ($total > 0) {
        exit("Sis vardas jau buvo uzregistruotas, prasome pasirinkti kita");
    }
    $query = "INSERT INTO userlist VALUE (NULL,
                                            '$_POST[name]',
                                            '$_POST[pass]',
                                            '$_POST[email]',
                                            '$_POST[url]')";
    if (mysqli_query($link, $query)) {
        echo "<html>
                <head>
                <meta http-equiv='Refresh' content='0; url=$_SERVER[PHP_SELF]'>
                </head>
                </html>";
    } else {
        exit("Klaida papildant duomenis - " . mysqli_error($query));
    }
    ?>
</body>

</html>