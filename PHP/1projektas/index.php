<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Data form</title>
</head>
<body>
<?php
if(isset($_POST['act'])&& $_POST['act'] == 'act') {
    echo "Vardas: ".$_POST['name'];
    echo "<br>E_mailas: ".$_POST['email'];
    echo "<br><u>Isrinkta elementu - ".(count($_POST) - 6). "</u>";

    for($j = 0;$j < 4;$j++) {
        if(isset($_POST['chk'.$j])) {
            echo "<br>Isrinkta - ".$_POST['chk'.$j];
        }
    }
    echo "<br>Vienintelis isrinkiimas - ".$_POST['rad'];
    echo "<br>Komentaras - ".$_POST['coment'];
    echo "<br><br><a href=".$_SERVER['PHP_SELF'].">Dar karta</a>";
    exit;
}
else {
    ?>
        <form action ="<?php echo $_SERVER['PHP_SELF']; ?>" method="POST">
        Vardas: <input type="text" name="name"><br>
        Emailas: <input type="text" name="email"><br><br>
        Galima pasirinkti daug<br>
        <?php
        for($i = 1;$i < 4;$i++) {
            echo "<INPUT TYPE='checkbox' NAME='chk$i' VALUE='pasirinkti $i'>Pasirinkimas $i <br>";
        }
        ?>
        <br>Vienintelis pasirinkimas: <br>
        <INPUT TYPE="radio" NAME="rad" VALUE="Pasirinkimas 1"CHECKED>1 Pasirinkimas<br>
        <INPUT TYPE="radio" NAME="rad" VALUE="Pasirinkimas 2">2 Pasirinkimas<br>
        <INPUT TYPE="radio" NAME="rad" VALUE="Pasirinkimas 3">3 Pasirinkimas<br>
        Komentaras:<br>
        <textarea name="coment" rows="5" cols="20">Cia komentaras</textarea>
        <br><br>
        <input type="hidden" name="act" value="act">
        <input type="submit" name="submit" value="Issiusti">
        <input type="reset" name="reset" value="Isvalyti">
        </form>
    </body>
</html>
<?php
}