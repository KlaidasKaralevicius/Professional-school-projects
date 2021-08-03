<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <?php
        $arrayAsoc = array(
            '0' => array (
                '00' => 100,
                '01' => array (
                    '010' => 1000,
                    '011' => array (
                        '0110' => 1010,
                        '0111' => array ( 
                            '01110' => 2200,
                            '01111' => 2002
                        )
                    )
                )
            ),
            '1' => 20,
            '2' => 30,
            '3' => 40
        ); 
        $sumAsoc = 0;
        foreach ($arrayAsoc as $level) {
            if (is_array($level)) {
                foreach ($level as $level2) {
                    if (is_array($level2)) {
                        foreach ($level2 as $level3) {
                            if (is_array($level3)) {
                                foreach ($level3 as $level4) {
                                    if (is_array($level4)) {
                                        foreach ($level4 as $level5) {
                                            $sumAsoc += $level5;
                                        }
                                    } else {
                                        $sumAsoc += $level4;
                                    }
                                }
                            } else {
                                $sumAsoc += $level3;
                            }
                        }
                    } else {
                        $sumAsoc += $level2;
                    }
                }
                // echo "sis elementas yra masyvas<br>";
            } else  {
                $sumAsoc += $level;
            }
        }
        echo $sumAsoc;
    ?>
</body>
</html>