<?php
session_start();
if (@$_SESSION['user']) {
    header ('Location: profile.php');
}
?>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Autorizacija ir registracija</title>
    <link rel="stylesheet" href="assets/css/main.css">
</head>

<body>
    <form action="vendor/signin.php" method="POST">
        <label>Login</label>
        <input type="text" name="login" placegholder="Iveskite savo Login">
        <label>Slaptazodis</label>
        <input type="password" name="password" placegholder="Iveskite savo slaptazodi">
        <button type="submit">Prisijungti</button>
        <p>Dar neturite paskyros? - <a href="register.php">Registruokites</a></p>
        <?php
        if (@$_SESSION['message']) {
            echo '<p class="msg">' . $_SESSION['message'] . '</p>';
        }
        unset($_SESSION['message']);
        ?>
    </form>
</body>

</html>