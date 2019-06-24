import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

//Agrego El Import http module Y Luego Se Lo Inserta En Los Imports
//El Import Este Nos Permite Comunicarnos Mediante Peticiones Http
import{HttpClientModule} from '@angular/common/http';
import{ReactiveFormsModule} from '@angular/forms';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';

//Import De Nuestro Servicio
import {BikeService} from './service/bike.service';
import { AdminComponent } from './components/admin/admin.component';

//Decorador Ng Module, Identifica Una Clase Como Modulo De Angular
//Esto Dice A Angular Como Debe Compilar E Iniciar La Aplicacion
@NgModule({
  declarations: [
    AppComponent,
    AdminComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule, //Agrego El Client Module A Los Imports
    ReactiveFormsModule
  ],
  //Se Agrega El Servicio Al Array De Providers
  providers: [BikeService],
  //Bootstrap Componente Raiz Que Angular Crea E Inserta En El Index.html
  bootstrap: [AppComponent]
})
export class AppModule { }
