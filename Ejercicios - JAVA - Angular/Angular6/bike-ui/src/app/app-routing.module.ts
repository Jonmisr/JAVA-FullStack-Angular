import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {AdminComponent} from './components/admin/admin.component';

//Dentro De Este Archivo Se Configura Las Rutas De La App
const routes: Routes = [
  {
  path: 'admin',
  component: AdminComponent
  }
];

//Aca @ -> Son Directivas
@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
