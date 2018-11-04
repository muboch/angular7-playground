import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { SgtkinComponent } from './sgtkin/sgtkin.component';

const routes: Routes = [
  { path: 'sgtkin', component: SgtkinComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
