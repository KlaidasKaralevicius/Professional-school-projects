<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <?php
        $a = 5;
        $b = 7;
        $c = 9;
        $arrayInt = array ();
        //masyvo elementu inicializavimas
        $arrayInt[]= 5;
        $arrayInt[]= 7;
        $arrayInt[]= 9;
        //masyvo isvedimas
        echo $arrayInt;
        echo "<br>";
        //print_r masyvo isvedimas
        print_r($arrayInt);
        $arrayInt[]= 11;
        echo "<br>";
        print_r($arrayInt);
        $arrayString = array (
            'pirmas',
            'antras',
            'trecias'
        );
        echo "<br>";
        //elementas HTML <pre></pre>
        echo "<pre>";
        print_r($arrayString);
        echo "</pre>";
        //elementai bet kokio tipo
        $arrayNumType = array (
            '5',
            12,
            'stringas',
            TRUE,
            FALSE
        );
        echo '<pre>';
        print_r($arrayNumType);
        echo '</pre>';
        echo '<br>';
        //
        $arrayString1 = array(
            100=>'pirmas',
            110=>'antras',
            133=>'trecias'
        );
        echo "<pre>";
        print_r($arrayString1);
        echo "</pre>";
        echo '<br>';
        echo $arrayString1[100];
        //indeksas ne skaicius, o simboliu eilute (asocialus masyvas)
        $arrayString2 = array(
            'prekes id'=>'15548354',
            'pavadinimas'=>'televizorius',
            'modelis'=>'Philips'
        );
        echo "<pre>";
        print_r($arrayString2);
        echo "</pre>";
        echo '<br>';
        echo 'pirmo masyvo elemento reiksme: '.$arrayString2['prekes id'];
    ?>
</body>
</html>