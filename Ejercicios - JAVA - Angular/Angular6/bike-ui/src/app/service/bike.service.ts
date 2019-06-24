import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';

const httpOptions = {
    headers : new HttpHeaders({'Content-Type:':'application/json'})
}

//Injectable: Esta Funcion Proviene Del Core De Angular
//Y Nos Indica Que Esta Clase Puede Ser Injectada Dinamicamente A Quien Lo Demande
@Injectable({
  providedIn: 'root'
})
export class BikeService {

  //Para Hacer Que Se Pueda Utilizar El HttpClient En Nuestro Codigo
  //Se Debe Injectar En Los Parametro De Nuestro Constructor, Indicando El Modificador De Acceso
  //Seguido Del Nombre De La Variable Y El Tipo
  
  constructor(private http:HttpClient) { 

   }

   //Nombre De La Funcion De Service Que Nos Permitira Obetener
   //Todas Las Bikes, A Este Se Lo Puede Llamar Desde Un Componente
   //Y No Se Devolvera La Carga En Formato Json, Esta Peticion Sera Redireccionada
   //Al Server De Spring Boot Y Nos Devuelve El Json Como Un Observable
   getBikes(){
    return this.http.get('/server/api/v1/bikes');
   }
   
   

  }
