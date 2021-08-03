<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Read message</title>
</head>

<body>
    <table>
        <tr>
            <td>
                <?php
                if (!file_exists("m.txt")) { // jei nera m.txt baigti veiksma su "No message!" irasu
                    exit("No message!");
                } else { // jei m.txt yra vykdyti tolesnius veiksmus
                    $fp = fopen("m.txt", "r+");
                    $n = file("m.txt");
                    fclose($fp);
                    // atidaryti m.txt, ideti irasa
                    for ($i = 0; $i < count($n); $i++) {
                        echo $n[$i] . "</br>";
                    } //ivesti kiek buvo irasu i n.txt
                    unlink("n.txt"); // sunaikina n.txt faila
                    unlink("m.txt"); // sunaikina m.txt faila
                    exit;
                }
                ?>
            </td>
        </tr>
    </table>
</body>

</html>