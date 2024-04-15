<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    
    <link rel="stylesheet" href="../Styles/style.css">
    <title>Tarpaulin - Your Joined Communities</title>
  </head>
  <body class="studentHomeBody">
    <script src="../Scripts/userTypeLocalStorage.js"></script>
    <script src="../Scripts/userTypeLocalStorageAuthPageCheck.js"></script>
    <script src="../Scripts/header.js"></script>

    <img class="openNavbar" src="../Images/menu.svg">

    <script src="../Scripts/loadSidebar.js"></script>

    <section class="mainContainer profile">
        <div class="top">
            <img draggable="false" class="profileIcon" src="../Images/user-solid-circle.svg">
            <div>
                <p>Your Profile</p>
                <p>View or update your account information</p>
            </div>
        </div>

        <section class="profileSettings">

            <div>
                <p>Username</p>
                <input type="text" placeholder="Username" value="aUser">
            </div>

            <div>
                <p>First Name</p>
                <input type="text" placeholder="First" value="First">
            </div>

            <div>
                <p>Last Name</p>
                <input type="text" placeholder="Last" value="Last">
            </div>

            <div>
                <p>Email</p>
                <input type="text" placeholder="Email" value="your.email.csbsju.edu">
            </div>

            <div>
                <p>Password</p>
                <img class="passwordToggleIcon" src="../Images/eye.png" onclick="
                    let input = document.getElementById('password');
                    
                    if(input.type == 'password') {
                        this.src = '../Images/view.png';
                        input.type = 'text';
                    }
                    else{
                        this.src = '../Images/eye.png';
                        input.type = 'password';
                    }
                ">
                <input type="password" id="password" placeholder="password" value="password12345">
            </div>

        </section>
    </section>

    <script src="../Scripts/navbarToggle.js"></script>

  </body>
</html>

<%@include file="../DBconnection.jsp"%>

<%@page import="
    java.sql.*,
    oracle.jdbc.*
"%>

<%
// Retrieve form data
String username = request.getParameter("username");
String newPassword = request.getParameter("newPassword");

// Call the stored procedure to modify the student's profile
try {
    CallableStatement cs = con.prepareCall("{call modify_student_profile(?, ?)}");
    cs.setString(1, username);
    cs.setString(2, newPassword);
    cs.executeUpdate();
    cs.close();
    out.println("Username/Password updated successfully."); // Or any other success message
} catch (SQLException e) {
    // Handle any SQL exceptions
    out.println("An error occurred while updating username/password: " + e.getMessage());
    e.printStackTrace();
} finally {
    // Close the connection
    try {
        if (con != null) {
            con.close();
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
}
%>
