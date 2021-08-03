<?php
session_start();
require_once 'connection/connect.php';
if (!@$_SESSION['user']) {
    header('Location: index.php');
}
?>

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <script src="https://kit.fontawesome.com/9d544f030b.js" crossorigin="anonymous"></script>
    <link href="https://fonts.googleapis.com/css2?family=Sacramento&family=Spectral+SC&display=swap" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css2?family=Zilla+Slab+Highlight&display=swap" rel="stylesheet">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <link href="css/style2.css" rel="stylesheet">
</head>

<body>
    <div id="blurbg"></div>
    <div id="theuser">
        <center>
            <div class="username"><?= $_SESSION['user']['login'] ?></div>
        </center>
        <p id="loginmessage">is connected to the system</p>
        <a href="delete.php" class="d_user" onclick="return confirm('Are you sure? Process after deletion can be undone!')"><i id="delacc" class="fas fa-trash fa-sm"></i></a>
        <a href="connection/logout.php" class="logout">Logout</a>
    </div>
    <div class="searchbox">
        <input type="text" id="search" placeholder='FIND PROJECT'>
        <i class='fas fa-search fa-3x'></i>

    </div>

    <div id="projheader">
        <h1 id="plisth1">Projects list</h1>
        <div id="tableheader">
            <table id="subtable">
                <tr class="theder">
                    <th class="projectrow">Project</th>
                    <th class="description">Description</th>
                    <th class="status">Status</th>
                    <th id="alltasks">All Tasks</th>
                    <th id="remtasks">Remaining Tasks</th>
                    <th id="write"> </th>
                    <th id="delete"> </th>
                </tr>
            </table>
        </div>
    </div>
    <div id="allprojects">
        <table>
            <!--               <tr class="theder">
                 <th class="projectrow">Project</th>
                 <th class="description">Description</th>
                 <th class="status">Status</th>
                 <th id="alltasks">All Tasks</th>
                 <th id="remtasks">Remaining Tasks</th>
             </tr>-->

            <?php

            $query = "SELECT * FROM projects ORDER BY ID DESC";
            $result = mysqli_query($connect, $query);

            if (mysqli_num_rows($result) > 0) {

                while ($row = mysqli_fetch_array($result)) {
                    $projectID = $row['ID'];
                    $countTasks = "SELECT count(*) as taskQuantity FROM `tasks` WHERE projectID = '$projectID'";
                    $countResult = $connect->query($countTasks);
                    $task1 = $countResult->fetch_assoc();

                    $countLeft = "SELECT count(*) as taskTodo FROM `tasks` WHERE projectID = '$projectID' AND status = 'todo'";
                    $leftResult = $connect->query($countLeft);
                    $task2 = $leftResult->fetch_assoc();

                    $countCompleted = "SELECT count(*) as taskCompleted FROM `tasks` WHERE projectID = '$projectID' AND status = 'completed'";
                    $completedResult = $connect->query($countCompleted);
                    $task3 = $completedResult->fetch_assoc();

                    if ($task1["taskQuantity"] === $task2["taskTodo"]) {
                        $status = 'todo';
                    } else if ($task3["taskCompleted"] !== $task1["taskQuantity"] && $task2["taskTodo"] !== $task1["taskQuantity"]) {
                        $status = 'in progress';
                    } else if ($task3["taskCompleted"] === $task1["taskQuantity"]) {
                        $status = 'completed';
                    }

            ?>
                    <tr>
                        <td class="name"><a href="tasks.php?id=<?php echo $row['ID']; ?>"><?php echo $row["name"]; ?></a></td>
                        <td><?php echo $row["description"]; ?></td>
                        <td><?php echo $status ?></td>
                        <td><?php echo $task1["taskQuantity"]; ?></td>
                        <td style="color:red"><?php echo $task1["taskQuantity"] - $task3["taskCompleted"]; ?></td>


                        <td class="icspace"><a id="edit" href="connection/edit.php?id=<?php echo $row['ID']; ?>"><i class="far fa-edit fa fa-lg"></i></a></td>

                        <td class="icspace"><a href="connection/del.php?id=<?php echo $row['ID']; ?>"><i class="fas fa-trash fa-lg"></i></a></td>
                        <td hidden class="id"><?php echo $row["ID"]; ?></td>
                    </tr>
            <?php
                }
            }
            ?>
        </table>
        <center><a href="#" onclick="toggle()" class="newproj">
                <h2>NEW PROJECT</h2>
            </a></center>


        <a href="connection/export_project.php" class="exproject">
            <p>Export Projects to CSV</p>
            <!--              <i class="fas fa-file-export"></i>          -->
        </a>
    </div>



    <div id="newprojbox">
        <center>
            <h2>NEW PROJECT</h2>
        </center>
        <form action="connection/addProject.php" method="POST">
            <div id="projname">
                <center><label>Enter the project name</label></center><br>
                <center><input name="name" type="text" required="required" title="add name for project"></center>
            </div><br>
            <div id="projdes">
                <center><label>Enter the project description</label></center>
                <center><textarea name="description" type="text" required="required" title="add project description"></textarea></center>
            </div><br>
            <center><button type="submit" id="init">INITIATE</button></center>
        </form>
        <a href="#" onclick="toggle()" class="back2work">BACK</a>
    </div>

    <script src="js/script.js"></script>
    <script src="js/workspace.js"></script>
</body>

</html>