<%-- 
    Document   : index
    Created on : 27/09/2021, 07:13:06 PM
    Author     : Usuario
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>CRUD contactos</title>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css">
        <script src="http://ajax.googleapis.com/ajax/libs/angularjs/1.2.15/angular.min.js"></script>
    </head>
    <body>
        <div class="container-fluid" ng-app="S33Contactos" ng-controller="contactosController as cn" >
            <div class="row">
                <div class="col-12">
                    <center> <h1>Proyecto Contactos</h1></center>  <%-- comentario  --%>
                </div>
            </div>
            <div class="row">
                <div class="col-6">
                    <h3> Sección 1</h3>  <!-- commentario 2 -->
                    <div class="row">
                        <div class="col-6">
                            <label>Identificación</label>
                            <input class="form-control" type="text" ng-model="cn.identificacion">
                        </div>
                        <div class="col-6">
                            <label>Nombre</label>
                            <input class="form-control" type="text" ng-model="cn.nombre">
                        </div>                        
                    </div>
                    <div class="row">
                        <div class="col-6">
                            <label>Apellido</label>
                            <input class="form-control" type="text" ng-model="cn.apellido">
                        </div>
                        <div class="col-6">
                            <label>Genero</label>
                            <select class="form-control" ng-model="cn.genero">
                                <option>Masculino</option>
                                <option>Femenino</option>
                                <option>Otro</option>
                            </select>
                            
                        </div>                        
                    </div>   
                    <div class="row">
                        <div class="col-6">
                            <label>Tipo de identificación</label>
                            <select class="form-control" ng-model="cn.tipoIdentificacion">
                                <option>CC</option>
                                <option>TI</option>
                            </select>                                                     
                        </div>
                        <div class="col-6">
                            <label>Telefono</label>
                            <input class="form-control" type="text" ng-model="cn.telefono">
                        </div>         
                        
                    </div>    
                    <div class="row">
                        <div class="col-6">
                            <label>Dirección</label>
                            <input class="form-control" type="text" ng-model="cn.direccion">
                        </div>
                        <div class="col-6">
                            <label>Correo</label>
                            <input class="form-control" type="text" ng-model="cn.correo">
                        </div>         
                        
                    </div>    
                    <br>
                    <div class="row">
                        
                        <div class="col-3">
                            <button class="btn btn-success" ng-click="cn.guardarContacto()"> Guardar </button>                            
                        </div>                        
                        <div class="col-3">
                            <button class="btn btn-primary" ng-click="cn.listarContactos()"> Listar Contactos </button>                            
                        </div>
                        <div class="col-3">
                            <button class="btn btn-danger" ng-click="cn.eliminarContacto()"> Eliminar Contacto </button>                            
                        </div>
                        <div class="col-3">
                            <button class="btn btn-warning" ng-click="cn.actualizarContacto()"> Actualizar Contacto </button>                            
                        </div>                                                                        
                    </div>
                   
                </div>                    
                <div class="col-6">
                    <h3>Sección 2</h3>
                    <div class="row">
                        <div class="col-6">
                            <label>Identificación</label>
                            <input class="form-control" type="text" value="{{cn.identificacion}}" disabled="">
                        </div>
                        <div class="col-6">
                            <label>Nombre</label>
                            <input class="form-control" type="text" value="{{cn.nombre}}" disabled="">
                        </div>                        
                    </div>
                    <div class="row">
                        <div class="col-6">
                            <label>Apellido</label>
                            <input class="form-control" type="text" value="{{cn.apellido}}" disabled="">
                        </div>
                        <div class="col-6">
                            <label>Genero</label>
                            <input class="form-control" type="text" value="{{cn.genero}}" disabled="">
                        </div>                        
                    </div>   
                    <div class="row">
                        <div class="col-6">
                            <label>Tipo de identificación</label>
                            <input class="form-control" type="text" value="{{cn.tipoIdentificacion}}" disabled="">
                        </div>
                        <div class="col-6">
                            <label>Telefono</label>
                            <input class="form-control" type="text" value="{{cn.telefono}}" disabled="">
                        </div>         
                        
                    </div>    
                    <div class="row">
                        <div class="col-6">
                            <label>Dirección</label>
                            <input class="form-control" type="text" value="{{cn.direccion}}" disabled="">
                        </div>
                        <div class="col-6">
                            <label>Correo</label>
                            <input class="form-control" type="text" value="{{cn.correo}}" disabled="">
                        </div>         
                        
                    </div>                     
                </div>                
            </div>
                <div class="row">
                    <div class="col-12 table-responsive-xl">
                        <h3>Sección 3</h3>
                        <table class="table table-striped table-hover">
                            <thead class="thead-dark">
                                <tr>
                                    <th>Identificación</th>
                                    <th>Nombre</th>
                                    <th>Apellido</th>
                                    <th>Género</th>
                                    <th>Tipo de Identificación</th>
                                    <th>Teléfono</th>
                                    <th>Dirección</th>
                                    <th>Correo</th>
                                </tr>                                
                            </thead>                            
                            <tr ng-repeat="contacto in cn.contactos">
                                <td>{{contacto.identificacion}}</td>
                                <td>{{contacto.nombre}}</td>
                                <td>{{contacto.apellido}}</td>
                                <td>{{contacto.genero}}</td>
                                <td>{{contacto.tipoIdentificacion}}</td>
                                <td>{{contacto.telefono}}</td>
                                <td>{{contacto.direccion}}</td>
                                <td>{{contacto.correo}}</td>                                
                            </tr>                                                        
                        </table>                        
                    </div>                    
                </div>
        </div>
    </body>
    <script>
        var app= angular.module('S33Contactos',[]);
        app.controller('contactosController',['$http',controladorContactos]);
        function controladorContactos($http){
            var cn=this;
            cn.listarContactos= function (){
                var params ={
                    proceso:"listarcontacto"
                };
            };
        }
    </script>
</html>
