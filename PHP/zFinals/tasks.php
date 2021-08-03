<?php
session_start();
require_once 'connection/connect.php';
if (!@$_SESSION['user']) {
     header('Location: index.php');
}
$id = $_GET['id'];
?>
<!DOCTYPE html>
<html lang="en">

<head>
     <meta charset="UTF-8">
     <meta name="viewport" content="width=device-width, initial-scale=1">
     <link href="https://fonts.googleapis.com/css2?family=Sacramento&family=Spectral+SC&display=swap" rel="stylesheet">
     <link href="https://fonts.googleapis.com/css2?family=Zilla+Slab+Highlight&display=swap" rel="stylesheet">
     <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
     <script src="https://kit.fontawesome.com/9d544f030b.js" crossorigin="anonymous"></script>
     <link href="css/tasks.css" rel="stylesheet">
</head>

<body>
     <div id="blurbg"></div>
     <div class="searchbox">
          <center>
               <h2>Find Task</h2>
          </center>
          <input type="text" id="search" placeholder="">
     </div>
     <div id="header">
          <?php
          $name = mysqli_query($connect, "SELECT name FROM projects WHERE ID = '$id'");
          $projectName = mysqli_fetch_array($name);
          ?>
          <h1 class="btest" id="testh"><?php echo $projectName['name']; ?> Taskboard</h1>
     </div>

     <div id="alltasks">
          <div class="taskboard">
               <div id="newtaskcontainerheader">
                    <h2>New</h2>
                    <div class="newtaskcontainer container" id="freshy">
                         <?php
                         $query = "SELECT * FROM tasks WHERE status = 'todo' AND projectID = '$id' ORDER BY ID DESC";
                         $result = mysqli_query($connect, $query);

                         if (mysqli_num_rows($result) > 0) {

                              while ($row = mysqli_fetch_array($result)) {
                                   if ($row["priority"] === 'low') {
                                        $priorityColor = 'blue';
                                   } else if ($row["priority"] === 'medium') {
                                        $priorityColor = 'green';
                                   } else {
                                        $priorityColor = 'red';
                                   }
                                   $projectID = $row["projectID"];
                                   $ID = $row["ID"];
                                   $status = $row["status"];
                         ?>

                                   <div class="todo" id="ncard" draggable="true">
                                        <form>
                                             <!--                                       <input class="todoinput" name="status" value="1"/>-->
                                            <b><label class="labelid"><?php echo $row["ID"]; ?>.</label></b>
                                            <u><label><?php echo $row["name"]; ?></label></u><br>
                                             <label class="ldescription"><?php echo $row["description"]; ?></label><br>
                                             <label class="tpriority">Priority: <span style="color: <?php echo $priorityColor; ?>"><?php echo $row["priority"]; ?></span></label><br><br>
                                             <label class="date">Created on: <?php echo $row["startDate"]; ?></label><br>
                                             <label class="date">Modified on: <?php echo $row["modifiedDate"]; ?></label><br><br>
                                             <?php
                                             echo "
                                             <select class='status' onchange='location = this.value'>
                                                  <option class='current' disabled selected>$status</option>
                                                  <option value='connection/changeStatus.php?projectID=$projectID&ID=$ID&status=todo'>todo</option>
                                                  <option value='connection/changeStatus.php?projectID=$projectID&ID=$ID&status=in progress'>in progress</option>
                                                  <option value='connection/changeStatus.php?projectID=$projectID&ID=$ID&status=completed'>completed</option>
                                             </select>
                                             ";
                                             $projectID = $_GET['projectID'];
                                             $ID = $_GET['ID'];
                                             $newStatus = $_GET['status'];

                                             $changeStatus = mysqli_query($connect, "UPDATE tasks SET status = '$newStatus' WHERE projectID = '$projectID' AND ID = '$ID'");
                                             ?>
                                        </form>

                                        <div id="editdelete">
                                             <a href="connection/delTask.php?id=<?php echo $row['ID']; ?>"><i class="fas fa-trash fa-lg" id="deltask"></i></a>
                                             <a href="connection/editTask.php?id=<?php echo $row['ID']; ?>"><i class="far fa-edit fa fa-lg" id="edtask"></i></a>
                                        </div>
                                   </div>
                         <?php
                              }
                         }
                         ?>
                    </div>
               </div>
               <div id="inprogcontainerheader">
                    <h2>In progress</h2>
                    <div class="inprogcontainer container" id="inprogcontainer">
                         <?php
                         $query2 = "SELECT * FROM tasks WHERE status = 'in progress' AND projectID = '$id' ORDER BY ID DESC";
                         $result2 = mysqli_query($connect, $query2);

                         if (mysqli_num_rows($result2) > 0) {

                              while ($row2 = mysqli_fetch_array($result2)) {
                                   if ($row2["priority"] === 'low') {
                                        $priorityColor = 'blue';
                                   } else if ($row2["priority"] === 'medium') {
                                        $priorityColor = 'green';
                                   } else {
                                        $priorityColor = 'red';
                                   }
                                   $projectID2 = $row2["projectID"];
                                   $ID2 = $row2["ID"];
                                   $status2 = $row2["status"];
                         ?>
                                   <div class="in progress" draggable="true">
                                        <form>
                                             <!--                                       <input class="progressinput" name="status" value="2"/>-->
                                             <label class="labelid"><?php echo $row2["ID"]; ?>.</label>
                                             <label><?php echo $row2["name"]; ?></label><br>
                                             <label class="ldescription"><?php echo $row2["description"]; ?></label><br>
                                             <label class="tpriority">Priority: <span style="color: <?php echo $priorityColor; ?>"><?php echo $row2["priority"]; ?></span></label><br><br>
                                             <label class="date">Created on: <?php echo $row2["startDate"]; ?></label><br>
                                             <label class="date">Modified on: <?php echo $row2["modifiedDate"]; ?></label><br><br>
                                             <?php
                                             echo "
                                             <select class='status' onchange='location = this.value'>
                                                  <option class='current' disabled selected>$status2</option>
                                                  <option value='connection/changeStatus.php?projectID=$projectID2&ID=$ID2&status=todo'>todo</option>
                                                  <option value='connection/changeStatus.php?projectID=$projectID2&ID=$ID2&status=in progress'>in progress</option>
                                                  <option value='connection/changeStatus.php?projectID=$projectID2&ID=$ID2&status=completed'>completed</option>
                                             </select>
                                             ";
                                             ?>
                                        </form>
                                        <div id="editdelete">
                                             <a href="connection/delTask.php?id=<?php echo $row2['ID']; ?>"><i class="fas fa-trash fa-lg" id="deltask"></i></a>
                                             <a href="connection/editTask.php?id=<?php echo $row2['ID']; ?>"><i class="far fa-edit fa fa-lg" id="edtask"></i></a>
                                        </div>
                                   </div>
                         <?php
                              }
                         }
                         ?>
                    </div>
               </div>
               <div id="donecontainerheader">
                    <h2>Completed</h2>
                    <div class="donecontainer container" id="done">
                         <?php
                         $query3 = "SELECT * FROM tasks WHERE status = 'completed' AND projectID = '$id' ORDER BY ID DESC";
                         $result3 = mysqli_query($connect, $query3);

                         if (mysqli_num_rows($result3) > 0) {

                              while ($row3 = mysqli_fetch_array($result3)) {
                                   if ($row3["priority"] === 'low') {
                                        $priorityColor = 'blue';
                                   } else if ($row3["priority"] === 'medium') {
                                        $priorityColor = 'green';
                                   } else {
                                        $priorityColor = 'red';
                                   }
                                   $projectID3 = $row3["projectID"];
                                   $ID3 = $row3["ID"];
                                   $status3 = $row3["status"];
                         ?>
                                   <div class="completed" draggable="true">
                                        <form>
                                             <!--                                       <input class="completeinput" name="status" value="3"/>-->
                                             <label class="labelid"><?php echo $row3["ID"]; ?>.</label>
                                             <label><?php echo $row3["name"]; ?></label><br>
                                             <label class="ldescription"><?php echo $row3["description"]; ?></label><br>
                                             <label class="tpriority">Priority: <span style="color: <?php echo $priorityColor; ?>"><?php echo $row3["priority"]; ?></span></label><br><br>
                                             <label class="date">Created on: <?php echo $row3["startDate"]; ?></label><br>
                                             <label class="date">Modified on: <?php echo $row3["modifiedDate"]; ?></label><br><br>
                                             <?php
                                             echo "
                                             <select class='status' onchange='location = this.value'>
                                                  <option class='current' disabled selected>$status3</option>
                                                  <option value='connection/changeStatus.php?projectID=$projectID3&ID=$ID3&status=todo'>todo</option>
                                                  <option value='connection/changeStatus.php?projectID=$projectID3&ID=$ID3&status=in progress'>in progress</option>
                                                  <option value='connection/changeStatus.php?projectID=$projectID3&ID=$ID3&status=completed'>completed</option>
                                             </select>
                                             ";
                                             ?>
                                        </form>
                                        <div id="editdelete">
                                             <a href="connection/delTask.php?id=<?php echo $row3['ID']; ?>"><i class="fas fa-trash fa-lg" id="deltask"></i></a>
                                             <a href="connection/editTask.php?id=<?php echo $row3['ID']; ?>"><i class="far fa-edit fa fa-lg" id="edtask"></i></a>
                                        </div>
                                   </div>
                         <?php
                              }
                         }
                         ?>
                    </div>
               </div>
          </div>
          <a href="#" onclick="tasktoggle()" class="newtask">
               <h2>ADD TASK</h2>
          </a>
          <center><a href="connection/export_task.php?id=<?php echo $id; ?>" class="exportask">
                    <h2>Export to CSV</h2>
               </a></center>
     </div>
     <a id="b2proj" href="workspace.php"><i class="fas fa-arrow-left fa fa-4x"></i></a>


     <div id="newtaskbox">
          <center>
               <h2>NEW TASK</h2>
          </center>
          <form action="connection/addTask.php" method="POST">
               <div id="taskname">
                    <center><label>Task Name</label></center>
                    <center><input name="name" type="text" required="required" title="add task name"></center>
               </div><br>
               <div id="projdes">
                    <center><label>Task Description</label></center>
                    <center><textarea name="description" type="text" required="required" title="add task description"></textarea></center>
               </div><br>
               <div id="prio">
                    <label for="priority">Define priority</label>
                    <select name="priority" id="priority" required="required">
                         <option value="high" style="color: red;">HIGH</option>
                         <option value="medium" style="color: green;">MEDIUM</option>
                         <option value="low" style="color: blue;">LOW</option>
                    </select>
               </div><br>
               <br>
               <center><input hidden name="id" value="<?php echo $id; ?>"></center>
               <center><button type="submit" id="addtask">Add Task</button></center>
          </form>
          <a href="#" onclick="tasktoggle()" class="back2work">CANCEL</a>
     </div>
     <script src="js/script.js"></script>
     <script src="js/task.js"></script>
</body>
<!-- <script src="js/script.js"></script> -->

</html>

<?php

/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
