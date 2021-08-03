<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <?php
    $filename = array("all.php", "auth.php",
        "auth.txt", "base.txt",
        "chat.txt", "config.php",
        "count.txt", "count_new.txt",
        "create.php", "dat.db");
    ?>
    <form action="second.php" method="POST">
        <?php
        foreach ($filename as $name) {
            echo '<input type="hidden" name="filename[]" value="$name">';
        }
        ?>
        <input type="submit" value="Persiusti masyva">
    </form>
</body>
</html>