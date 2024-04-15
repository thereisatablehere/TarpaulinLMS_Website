<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    
    <link rel="stylesheet" href="../Styles/style.css">
    <title>Tarpaulin - Instructor Page</title>
  <link rel="icon" type="image/x-icon" href="../Images/Tarpaulin_Logo_Alt_2.png">
</head>
  <body class="studentHomeBody">
    <script src="../Scripts/userTypeLocalStorage.js"></script>
    <script src="../Scripts/header.js"></script>

    <script src="../Scripts/loadSidebar.js"></script>
    
    <section class="mainContainer">

        <p style="font-size: 2em; font-weight: bold;">John Doeson</p>

        <div style="
            display: flex;
            flex-direction: row;
            align-items: center;
        ">
            <div>
                <img draggable="false" class="star" src="../Images/star-full.svg">
                <img draggable="false" class="star" src="../Images/star-full.svg">
                <img draggable="false" class="star" src="../Images/star-full.svg">
                <img draggable="false" class="star" src="../Images/star-full.svg">
            </div>
            <p style="margin-left: 0.5em;">(4.5)</p>
        </div>

        <button class="buttonNormal" 
            style="margin: 0; font-size: 0.8em;"
            onclick='document.getElementById("ratingControls").style.display = "flex"'
        >Rate</button>
        <div id="ratingControls" style="
            display: none;
            flex-direction: row;
            align-items: center;
            justify-content: space-between;
            background-color: white;
            border: 1px solid black;
            border-radius: 20px;
            margin-top: 0.5em;
            padding: 7px;
            ">
            <label><input type="radio" name="rating">0</label>
            <label><input type="radio" name="rating">1</label>
            <label><input type="radio" name="rating">2</label>
            <label><input type="radio" name="rating">3</label>
            <label><input type="radio" name="rating">4</label>
            <label><input type="radio" name="rating">5</label>

            <button class="buttonAccent" style="font-size: 0.8em;"
                onclick='document.getElementById("ratingControls").style.display = "none"'
            >Submit</button>
        </div>

            <p style="
                font-size: 1.75em;
                font-weight: 500;
                margin-top: 1em;
                margin-bottom: 0;
            ">Courses</p>
  
            <section class="listContainer coursesList" style="margin-top: 0.5em;">
              
                <div style="
                    display: flex;
                    flex-direction: column;
                    border-bottom: 1px solid #00000040;
                    padding-left: 2em;
                    padding-right: 2em;
                    padding-bottom: 1em;
                ">
                    <a href="courseView.jsp" class="name" style="
                        font-size: 1.3em;
                        color: var(--accentColor);
                        text-decoration: none;
                        font-weight: bold;
                    ">CSCI 123</a>
                    
                    <div style="
                        display: flex;
                        flex-direction: row;
                        align-items: center;
                    ">
                        <div>
                            <img draggable="false" class="star" src="../Images/star-full.svg">
                            <img draggable="false" class="star" src="../Images/star-full.svg">
                            <img draggable="false" class="star" src="../Images/star-full.svg">
                            <img draggable="false" class="star" src="../Images/star-full.svg">
                        </div>
                        <p style="margin-left: 0.5em;">(4.5)</p>
                    </div>

                    <p>This is a really cool and good course.</p>
                </div>

                <div style="
                display: flex;
                flex-direction: column;
                border-bottom: 1px solid #00000040;
                padding-left: 2em;
                padding-right: 2em;
                padding-bottom: 1em;
                padding-top: 2em;
            ">
                <a href="courseView.jsp" class="name" style="
                    font-size: 1.3em;
                    color: var(--accentColor);
                    text-decoration: none;
                    font-weight: bold;
                ">CSCI 101</a>
                
                <div style="
                    display: flex;
                    flex-direction: row;
                    align-items: center;
                ">
                    <div>
                        <img draggable="false" class="star" src="../Images/star-full.svg">
                        <img draggable="false" class="star" src="../Images/star-full.svg">
                    </div>
                    <p style="margin-left: 0.5em;">(2.3)</p>
                </div>

                <p>Learn about cool computer stuff.</p>
            </div>

            <div style="
                    display: flex;
                    flex-direction: column;
                    padding-left: 2em;
                    padding-right: 2em;
                    padding-top: 2em;
                ">
                    <a href="courseView.jsp" class="name" style="
                        font-size: 1.3em;
                        color: var(--accentColor);
                        text-decoration: none;
                        font-weight: bold;
                    ">CSCI 321</a>
                    
                    <div style="
                        display: flex;
                        flex-direction: row;
                        align-items: center;
                    ">
                        <div>
                            <img draggable="false" class="star" src="../Images/star-full.svg">
                            <img draggable="false" class="star" src="../Images/star-full.svg">
                            <img draggable="false" class="star" src="../Images/star-full.svg">
                            <img draggable="false" class="star" src="../Images/star-full.svg">
                            <img draggable="false" class="star" src="../Images/star-full.svg">
                        </div>
                        <p style="margin-left: 0.5em;">(5.0)</p>
                    </div>

                    <p>Data stuff.</p>
                </div>

            </section>
  
        
    </section>
  </body>
</html>