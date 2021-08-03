<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>BIEF MESSAGE</title>
</head>

<body>
    <table width="100%" height="100%">
        <tr>
            <td align="center">
                <form action="<?php echo $_SERVER['PHP_SELF']; ?>">
                    Message: <br><textarea name="mes"></textarea><br><br>
                    <input name="yes" type="hidden" value="1">
                    <input type="reset" value="Clean">
                    <input type="submit" value="Send">
                </form>
                <?php
                if (!empty($_GET['yes'])) {
                    if (!empty($_GET['mes'])) {
                        $mes = ($_GET['mes']);
                    } else {
                        exit("Input message!");
                    }
                    if (!file_exists("n.txt")) {
                        $fp = @fopen("n.txt", "w");
                        fputs($fp, 1);
                        fclose($fp);
                        $n[0] = 1;
                    } else {
                        $fp = fopen("n.txt", "r");
                        $n = file("n.txt");
                        $n[0]++;
                        fputs($fp, $n[0]);
                        fclose($fp);
                    }
                    $dat = date("d.m.y H:i");
                    $fp = fopen("m.txt", "a");
                    fwrite($fp, $n[0] . ") " . $dat . " - " . $mes . "\r\n");
                    fclose($fp);
                    exit("Your message is accepted.");
                }
                ?>
            </td>
        </tr>
    </table>
</body>

</html>