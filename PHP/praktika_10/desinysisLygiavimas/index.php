<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <?php
        $filename = array ("all.php", "auth.php",
                            "auth.txt", "base.txt",
                            "chat.txt", "config.php",
                            "count.txt", "count_new.txt",
                            "counter.dat", "create.txt", "dat.db"); 
        $total = count($filename); 
        $max_length = 0;
        for ($i = 0; $i < $total; $i++) {
            $lenght = strlen($filename[$i]); 
            if ($lenght > $max_lenght) {
                $max_lenght = $lenght; 
            }
        }  
        echo "<pre>";
        foreach ($filename as $name) {
            printf ("%{$max_lenght}s\n", $name); 
        }
        echo "</pre>"; 
    ?>
</body>
</html>