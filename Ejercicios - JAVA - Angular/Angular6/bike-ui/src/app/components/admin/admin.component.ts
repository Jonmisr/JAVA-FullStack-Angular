import { Component, OnInit } from '@angular/core';
import {BikeService} from '../../service/bike.service';

@Component({
  selector: 'app-admin',
  templateUrl: './admin.component.html',
  styleUrls: ['./admin.component.css']
})
export class AdminComponent implements OnInit {

  public bikes;

  //Injectamos El Service En El Constructor De Components
  constructor(private bikeService: BikeService) { }

  ngOnInit() {
    //Le Decimos Al Componente Que Llame A La Funcion De GetBikes
    this.getBikes();
  }

  //Creo Una Funcion Que Llame Al Service Y Sirva Para Recorrer Los Bikes Que El Service Nos Devuelve
  //Y La Almacenamos En La Variable Bikes
  getBikes(){
    //Llamamos Al Servicio De Bikes Que Devuelve Un Observable
    //Y Nos Suscribimos A Ello
    this.bikeService.getBikes().subscribe(
      data => {this.bikes = data}, //Obtenemos Los Datos
      err => {console.error(err)}, //Obtengo Un Error
      () => console.log('bikes loaded') //Cerramos Sesion En La Consola
    );
  }
}
