<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <?php
        $arr = array (
            'Europa' => array ('Austrija', 'Vokietija', 'Ispanija'), 
            'Azija' => array ('Kinija', 'Laosas', 'Malaitija'), 
            'Afrika' => array ('Kenija', 'Egiptas', 'Libija')
            // trys asociatyvus masyvai
        );
        foreach ($arr as $Key => $family) {
            echo "<h2>$Key</h2>"."<ul>"; // isvesti asoc. masyvo rakta kaip antraste
            foreach ($family as $salis) {
                echo "<li>$salis</li>"; // isvesti asoc. masyvo reiskmes kaip sarasa
            }
            echo "</ul>";
            // isvesti asoc. masyvo rakta ir jo visas reiskmes
            // kartoti su visais asoc. masyvais
        }
    ?>
</body>
</html>