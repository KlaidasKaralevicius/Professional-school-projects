<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Data form</title>
</head>

<body>
    <?php
    if (isset($_POST['act']) && $_POST['act'] == 'act') {
        echo "Vardas: " . $_POST['name'];
        echo "<br><br>Slaptazodis: " . $_POST['password'];
        echo "<br><br>E_mailas: " . $_POST['email'];

        echo "<br><br>File: " . $_POST["fileToUpload"];
        
        echo "<br><br><u>Checkbox</u>";

        for ($j = 0; $j < 4; $j++) {
            if (isset($_POST['chk' . $j])) {
                echo "<br>Isrinkta - " . $_POST['chk' . $j];
            }
        }
        echo "<br><br>Radio - " . $_POST['rad'];
        echo "<br><br>Select - " . $_POST['carlist'];
        echo "<br><br>Komentaras - " . $_POST['coment'];
        echo "<br><br><a href=" . $_SERVER['PHP_SELF'] . ">Get back</a>";
        exit;
    } else {
    ?>
        <form action="<?php echo $_SERVER['PHP_SELF']; ?>" method="POST">
            Vardas: <input type="text" name="name"><br><br>
            Slaptazodis: <input type="password" name="password"><br><br>
            Emailas: <input type="text" name="email"><br><br>
            File upload
            <input type="file" name="fileToUpload"><br>
            <br>Checkbox<br>
            <?php
            for ($i = 1; $i < 4; $i++) {
                echo "<INPUT TYPE='checkbox' NAME='chk$i' VALUE='pasirinkti $i'>Pasirinkimas $i <br>";
            }
            ?>
            <br>Radio<br>
            <INPUT TYPE="radio" NAME="rad" VALUE="Pasirinkimas 1" CHECKED>1 Pasirinkimas<br>
            <INPUT TYPE="radio" NAME="rad" VALUE="Pasirinkimas 2">2 Pasirinkimas<br>
            <INPUT TYPE="radio" NAME="rad" VALUE="Pasirinkimas 3">3 Pasirinkimas<br>
            <br>Select<br>
            <select name="carlist">
                <option value="volvo">Volvo</option>
                <option value="saab">Saab</option>
                <option value="opel">Opel</option>
                <option value="audi">Audi</option>
            </select><br>
            <br>Textarea:<br>
            <textarea name="coment" rows="5" cols="20">Cia komentaras</textarea>
            <br><br>
            <input type="hidden" name="act" value="act">
            <input type="submit" name="submit" value="Submit">
        </form>
</body>

</html>
<?php
    }
