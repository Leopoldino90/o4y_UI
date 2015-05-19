<%-- 
    Document   : index
    Created on : 17-mag-2015, 16.59.19
    Author     : Dave
--%>

<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor
-->
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">


    <title>Welcome to Offer4You</title>

    <!-- Bootstrap core CSS -->
    <link href="css/bootstrap.min.css" rel="stylesheet"/>

    <!-- Custom styles for this template -->
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
          <p align="center"><img src="img/logo.png"></p>
      </div>
    </div>
    
<nav class="navbar navbar-inverse">
     
       
<div class="adapted-container"> 
         
        <form class="navbar-form navbar-left">
            <div class="btn-group">   
                <button type="button" class="btn btn-success dropdown-toggle" data-toggle="dropdown">Scegli per categoria<span class="caret"></span></button>
                <ul class="dropdown-menu" role="menu">
                    <li>Libri</li>
                    <li>Giochi</li>
                    <li>Musica</li>
                </ul>
                                    
                  
                    
            </div>
            
                <div class="form-group">
                <label style="color: #ffffff; margin-left: 200px;">Ricerca</label>   
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
                <form action="/sessions" method="post">
                    <fieldset class="text-primary">                        
                        <label style="margin-left: 12px;margin-top: 10px">Username</label>
                        <input style="margin-left: 12px;margin-right: 12px" type="text" class="form-control">
                        <label style="margin-left: 12px;margin-top: 10px">Password</label>
                        <input style="margin-left: 12px;margin-right: 12px" type="password" class="form-control">
                    </fieldset>
                    <fieldset class="success">
                        <button style="margin-left: 75%;margin-top: 10px" type="submit" class="btn btn-success">Ok</button>
                    </fieldset>
                </form>
                </ul>    
            </div>
            <a href="iscrizione.jsp">
                <button type="submit" class="btn btn-success"><span class="glyphicon glyphicon-log-in"></span>Sign up</button>
            </a>
        </div>
               
    
</div>
     
    </nav>

    <div class="container">
      <!-- Example row of columns -->
      <div class="row">
          <div class="col-md-12">
        <!-- Carousel
       
    ================================================== -->
        <p align="center" style="font-size: 32px">Offerte del giorno</p>
    <div id="myCarousel" class="carousel slide" data-ride="carousel">
      <!-- Indicators -->
      <ol class="carousel-indicators">
        <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
        <li data-target="#myCarousel" data-slide-to="1"></li>
        <li data-target="#myCarousel" data-slide-to="2"></li>
      </ol>
      <div class="carousel-inner" role="listbox">
        <div class="item active">
          <img class="first-slide" src="data:image/gif;base64,R0lGODlhAQABAIAAAHd3dwAAACH5BAAAAAAALAAAAAABAAEAAAICRAEAOw==" alt="First slide">
          <div class="container">
            <div class="carousel-caption">
              <img src="img/images4.jpg">
            </div>
          </div>
        </div>
        <div class="item">
          <img class="second-slide" src="data:image/gif;base64,R0lGODlhAQABAIAAAHd3dwAAACH5BAAAAAAALAAAAAABAAEAAAICRAEAOw==" alt="Second slide">
          <div class="container">
            <div class="carousel-caption">
              <img src="img/images.jpg">
            </div>
          </div>
        </div>
        <div class="item">
          <img class="third-slide" src="data:image/gif;base64,R0lGODlhAQABAIAAAHd3dwAAACH5BAAAAAAALAAAAAABAAEAAAICRAEAOw==" alt="Third slide">
          <div class="container">
            <div class="carousel-caption">
              <img src="img/images.png">
            </div>
          </div>
        </div>
      </div>
      <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
        <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
        <span class="sr-only">Previous</span>
      </a>
      <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
        <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
        <span class="sr-only">Next</span>
      </a>
    </div><!-- /.carousel -->
    
   <p align="center" style="font-size: 32px">Vicino a te</p>
    <div id="myCarousel2" class="carousel slide" data-ride="carousel2">
      <!-- Indicators -->
      <ol class="carousel-indicators">
        <li data-target="#myCarousel2" data-slide-to="0" class="active"></li>
        <li data-target="#myCarousel2" data-slide-to="1"></li>
        <li data-target="#myCarousel2" data-slide-to="2"></li>
      </ol>
      <div class="carousel-inner" role="listbox">
        <div class="item active">
          <img class="first-slide" src="data:image/gif;base64,R0lGODlhAQABAIAAAHd3dwAAACH5BAAAAAAALAAAAAABAAEAAAICRAEAOw==" alt="First2slide">
          <div class="container">
            <div class="carousel-caption">
                <img src="img/images1.jpg">
            </div>
          </div>
        </div>
        <div class="item">
          <img class="second-slide" src="data:image/gif;base64,R0lGODlhAQABAIAAAHd3dwAAACH5BAAAAAAALAAAAAABAAEAAAICRAEAOw==" alt="Second2slide">
          <div class="container">
            <div class="carousel-caption">
              <img src="img/images2.jpg">
            </div>
          </div>
        </div>
        <div class="item">
          <img class="third-slide" src="data:image/gif;base64,R0lGODlhAQABAIAAAHd3dwAAACH5BAAAAAAALAAAAAABAAEAAAICRAEAOw==" alt="Third2slide">
          <div class="container">
            <div class="carousel-caption">
              <img src="img/images3.jpg">
            </div>
          </div>
        </div>
      </div>
      <a class="left carousel-control" href="#myCarousel2" role="button" data-slide="prev">
        <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
        <span class="sr-only">Previous</span>
      </a>
      <a class="right carousel-control" href="#myCarousel2" role="button" data-slide="next">
        <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
        <span class="sr-only">Next</span>
      </a>
    </div>
    </div>
      </div>

      <hr>

    </div> <!-- /container -->


    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <script src="js/ie10-viewport-bug-workaround.js"></script>
    <!--
    <script type="text/javascript">
                $('#s1').on("click",function() {
                       alert("ciao");
                });</script>
    -->
    <script type="text/javascript">
        $('.dropdown-menu').click(function(e) {
                e.stopPropagation();
            });
        $('.selectpicker').selectpicker({container: 'body'});
    </script>
  </body>
</html>
