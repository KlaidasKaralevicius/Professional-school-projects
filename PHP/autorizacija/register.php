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
    <title>Registracija</title>
    <link rel="stylesheet" href="assets/css/main.css">
</head>

<body>
    <form action="vendor/signup.php" method="POST" enctype="multipart/form-data">
        <label>Vardas_Pavarde</label>
        <input type="text" name="full_name" placeholder="Iveskite savo varda ir pavarde">
        <label>Login</label>
        <input type="text" name="login" placeholder="Iveskite savo Login">
        <label>Pastas</label>
        <input type="email" name="email" placeholder="Iveskite savo el. pasta">
        <label>Profilio nuotrauka</label>
        <input type="file" name="avatar">
        <label>Slaptazodis</label>
        <input type="password" name="password" placeholder="Iveskite savo slaptazodi">
        <label>Slaptazodis</label>
        <input type="password" name="password_confirm" placeholder="Pakartokite savo slaptazodi">
        <button type="submit">Registruotis</button>
        <p>Jus jau turite paskyra? - <a href="index.php">Autorizuokites</a></p>
        <?php
            if (@$_SESSION['message']) {
                echo '<p class="msg">' . $_SESSION['message'] . '</p>';
            }
            unset ($_SESSION['message']);
        ?>
    </form>
</body>

</html>