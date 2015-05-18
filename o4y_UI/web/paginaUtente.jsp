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
                <button type="button" class="btn btn-success dropdown-toggle" data-toggle="dropdown">Ciao, Germano <span class="caret"></span></button>
                <ul class="dropdown-menu" role="menu">
                    <a href=""><li class="li-custom">Il Mio Account<li></a>
                    <a href=""><li class="li-custom">Ultime Offerte Viste<li></a>
                    <a href=""><li class="li-custom">Consigliati per te<li></a>
                    <li class="divider"></li>
                    <a href=""><li class="li-custom">Non sei Germano? Esci</li></a>
                </ul>
            </div>
            <a href="iscrizione.jsp">
                <button type="submit" class="btn btn-success"><span class="glyphicon glyphicon-log-in"></span>Sign up</button>
            </a>
        </div>
               
    
    </div>
     
    </nav>

    
    <div class="panel-default-invisible">
        <div class="row">
            <form role="form">
                <div class="col-md-4">
                    <div class="panel panel-default-center">
                    <div class="form-group-with-margin">
                        <label for="usr">Offerte Recenti</label>
                        <h3 class="h3-custom">Gestisci le offerte che ti interessano</h3>
                    </div>
                    </div>    
                </div>
                <div class="col-md-4">
                    <div class="panel panel-default-center">
                    <div class="form-group-with-margin">
                        <label for="usr">Cronologia Offerte</label>
                        <a href=""><h3 class="h3-custom">Visualizza le offerte che hai visto recentemente</h3></a>
                        <a href=""><h3 class="h3-custom">Visualizza le offerte che sono ancora attive</h3></a>                     
                    </div>
                    </div>    
                </div>
                <div class="col-md-4">
                    <div class="panel panel-default-center">
                    <div class="form-group-with-margin">
                        <label for="usr">Ulteriori Opzioni</label>
                        <a href=""><h3 class="h3-custom">Lascia un Feedback su un prodotto offerto</h3></a>
                        <a href=""><h3 class="h3-custom">Lascia un Feedback su un venditore</h3></a>
                    </div>
                    </div>    
                </div>
            </form>
        </div> <!-- end row1 -->
    </div>
    
    <div class="panel-default-invisible">
        <div class="row">
            <form role="form">
                <div class="col-md-4">
                    <div class="panel panel-default-center">
                    <div class="form-group-with-margin">
                        <label for="usr">Area Personale</label>
                        <h3 class="h3-custom">Gestisci i tuoi dati</h3>
                    </div>
                    </div>    
                </div>
                <div class="col-md-4">
                    <div class="panel panel-default-center">
                    <div class="form-group-with-margin">
                        <label for="usr">Impostazioni Account</label>
                        <a href=""><h3 class="h3-custom">Modifica nome, e-mail, indirizzo e password</h3></a>
                        <a href=""><h3 class="h3-custom">Hai dimenticato la password?</h3></a>
                        <a href=""><h3 class="h3-custom">Gestione notifiche via app</h3></a>
                    </div>
                    </div>    
                </div>
                <div class="col-md-4">
                    <div class="panel panel-default-center">
                    <div class="form-group-with-margin">
                        <label for="usr">Comunicazioni da Offer4You</label>
                        <a href=""><h3 class="h3-custom">Preferenze di comunicazione</h3></a>
                        <a href=""><h3 class="h3-custom">Notifica scadenza offerte</h3></a>
                    </div>
                    </div>    
                </div>
            </form>
        </div> <!-- end row2 -->
    </div>
    
    <div class="panel-default-invisible">
        <div class="row">
            <form role="form">
                <div class="col-md-4">
                    <div class="panel panel-default-center">
                    <div class="form-group-with-margin">
                        <label for="usr">Offerte Personali</label>
                        <h3 class="h3-custom">Gestisci le offerte che hai creato</h3>
                    </div>
                    </div>    
                </div>
                <div class="col-md-4">
                    <div class="panel panel-default-center">
                    <div class="form-group-with-margin">
                        <label for="usr">Cronologia Offerte Personali</label>
                        <a href=""><h3 class="h3-custom">Visualizza tutte le offerte che hai creato</h3></a>
                        <a href=""><h3 class="h3-custom">Gestisci le offerte che sono ancora attive</h3></a> 
                    </div>
                    </div>    
                </div>
                <div class="col-md-4">
                    <div class="panel panel-default-center">
                    <div class="form-group-with-margin">
                        <label for="usr">Ulteriori Opzioni</label>
                    </div>
                    </div>    
                </div>
            </form>
        </div> <!-- end row2 -->
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
  </body>
</html>