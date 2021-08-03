<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <?php
    // $a = -5;
    // $b = 10;
    // $c = 15;
    // $sumMat = $a + $b + $c;
    // echo "Sum mathematialy ->".$sumMat;
    // echo "<br>";
    // $sumProg = 0;
    // $sumProg += $a;
    // $sumProg += $b;
    // $sumProg += $c;
    // echo "Sum programarly ->".$sumProg;
    // echo "<br>";
    // $array = array (
    //     10,
    //     20,
    //     70
    // );
    // $sumWhile = 0;
    // $i = 0;
    // while ($i < count($array)) {
    //     $sumWhile += $array[$i];
    //     $i++;
    // }
    // echo "Sum with while loop -> ".$sumWhile;
    // echo "<br>";
    // $sumFor = 0;
    // for ($i = 0; $i < count($array); $i++) {
    //     $sumFor += $array[$i];
    // }
    // echo "Sum with for loop -> ".$sumFor;
    // echo "<br>";
    $array = array(
        10, //$array [0]
        array(
            100, // $array [1] [0]
            array (
                1000, // $array [1] [1] [0]
                2000,
                3000
            ),
            300
        ),
        70,
        150
    );
    echo "<pre>";
    print_r($array);
    echo "</pre>";
        $sumForeach = 0;
        foreach ($array as $value) {
            if (is_array($value)){
            echo "<pre>";
            print_r($value);
            echo "</pre>";
        } else {
            $sumForeach += $value;
        }
        }
        echo "Sum with foreach loop ->".$sumForeach;
        echo "<br>";    
    ?>
</body>
</html>