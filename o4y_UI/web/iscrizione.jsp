<%-- 
    Document   : iscrizione
    Created on : 7-mag-2015, 10.12.06
    Author     : Dave
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">


    <title>Jumbotron Template for Bootstrap</title>

    <!-- Bootstrap core CSS -->
    <link href="css/bootstrap.min.css" rel="stylesheet"/>

    <!-- Custom styles for this template -->
    <link rel="stylesheet" href="css/jquery.datepicker.css">
    <link href="css/stili-custom.css" rel="stylesheet"/>

    <!-- Just for debugging purposes. Don't actually copy these 2 lines! -->
    <!--[if lt IE 9]><script src="../../assets/js/ie8-responsive-file-warning.js"></script><![endif]-->
    <script src="js/ie-emulation-modes-warning.js"></script>


    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
    
    
    
  </head>

  <body>


      
      


    <!-- Main jumbotron for a primary marketing message or call to action -->
    <div class="banner">
      <div class="container">
         <p align="center"><img src="img/logo.png" name="logo"></p>
      </div>
    </div>
    
<nav class="navbar navbar-inverse">
     
       
<div class="adapted-container"> 
         
        <form class="navbar-form navbar-left">
            <div class="btn-group">   
                <button type="button" class="btn btn-success dropdown-toggle" data-toggle="dropdown">Scegli per categoria <span class="caret"></span></button>
                <ul class="dropdown-menu" role="menu">
                    <li>Libri</li>
                    <li>Giochi</li>
                    <li>Musica</li>
                </ul>
            </div>
            
                <div class="form-group">
                <label style="color: #ffffff;margin-left: 120px">Ricerca</label>     
                <select class="form-control" id="s1">
                   <option id="block" value="tlc" selected> Tutte le categorie</option>
                   <option value="pomodori">pomodori</option>
                   <option value="latte">latte</option>
                   <option value="banane">banane</option>
                </select>
                
            </div>

            <div class="form-group">
              <input style="width: 350px" type="text" placeholder="Search" class="form-control">
            </div>
           <button type="submit" class="btn btn-success"><span class="glyphicon glyphicon-search"></span> Cerca</button>
        </form>
        <div class="navbar-form navbar-right">
            <div class="btn-group">   
                <button type="button" class="btn btn-success dropdown-toggle" data-toggle="dropdown"><span class="glyphicon glyphicon-user"></span> Sign in</button>
                <ul class="dropdown-menu" role="menu">
                    <li>
                        <label style="margin-left: 12px;margin-top: 10px">Username</label>
                        <input style="margin-left: 12px;margin-right: 12px" type="text" class="form-control">
                    </li>
                    <li>
                        <label style="margin-left: 12px;margin-top: 10px">Password</label>
                        <input style="margin-left: 12px;margin-right: 12px" type="password" class="form-control">
                    </li>
                    <li>
          
                        <button style="margin-left: 75%;margin-top: 10px" type="submit" class="btn btn-success">ok</button>
                    </li>                            
                    

                </ul>
            </div>
            <a href="iscrizione.jsp">
                <button type="submit" class="btn btn-success"><span class="glyphicon glyphicon-log-in"></span>Sign up</button>
            </a>
        </div>
               
    
</div>
     
    </nav>

    
<div class="panel panel-default2">
  <h2>Iscrizione</h2>
  <div class="row">
        <form role="form">
            <div class="col-md-4">
                    <div class="form-group-with-margin">
                      <label for="usr">Nome:</label>
                      <input type="text" class="form-control" >
                    </div>

                    <div class="form-group-with-margin">
                      <label for="usr">Cognome:</label>
                      <input type="text" class="form-control" >
                    </div>
                    
                    <div class="form-group-with-margin">
                        <label >Data di Nascita:</label>
                        <input type="text" class="form-control" name="date" placeholder="Es: 13/10/1987">
                    </div>
                    
                    <div class="form-group-with-margin">
                        <label >Luogo di Nascita:</label>
                        <input type="text" class="form-control">
                    </div>
                
                    <div class="form-group-with-margin">
                        <label >Indirizzo E-Mail:</label>
                        <input type="text" class="form-control">
                    </div> 
                
                    <div class="form-group-with-margin">
                        <label >Tipo di Utente</label>
                        <select class="form-control" id="form_iscrizione" onchange=changeForm()>
                          <option>Privato</option>
                          <option>Commerciante</option>
                        </select>
                    </div>
                
            </div>
            <div class="col-md-4">
                <div class="form-group-with-margin" style="display:none" id="block_commerciante">
                        <div class="form-group-with-margin">
                            <label >Nome Azienda:</label>
                            <input type="text" class="form-control">
                        </div>
                        <div class="form-group-with-margin">
                            <label >Partita IVA:</label>
                            <input type="text" class="form-control">
                        </div>
                    
                        <div class="form-group-with-margin">
                            <label >Sede Legale:</label>
                            <input type="text" class="form-control">
                        </div>
                </div>
            </div>
        </form>
 </div>
  
 <div class="row">
    <div class="col-md-4"></div>
    <div class="col-md-4"></div>
    <div class="col-md-4">
        
            <button type="submit" class="btn btn-success">Conferma <span class="glyphicon glyphicon-ok-circle"></span></button>
            <button type="submit" class="btn btn-danger">Annulla <span class="glyphicon glyphicon-remove-circle"></span></button>
            <p></p>
       
    </div>
</div> 
</div>
    



   
            


    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script type="text/javascript" src="js/jquery.datepicker.js"></script>
    <script type="text/javascript" src="js/uploadImage.js"></script>
    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <script src="js/ie10-viewport-bug-workaround.js"></script>
    <!--
    <script type="text/javascript">
                $('#s1').on("click",function() {
                       alert("ciao");
                });</script>
    -->
    <script type="text/javascript">
        function changeForm() {
            var form = document.getElementById('form_iscrizione');

                var modify = document.getElementById('block_commerciante');
                if (form.value == 'Commerciante') {             
                  modify = modify.setAttribute("style","display:block");
                }
                else {
                  modify = modify.setAttribute("style","display:none");
                }
        }
    </script>
  </body>
</html>
