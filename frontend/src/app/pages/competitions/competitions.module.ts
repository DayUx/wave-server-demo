import { NgModule } from '@angular/core';
import {CommonModule, NgForOf, NgIf} from '@angular/common';
import {CompetitionsComponent} from "./components/competitions/competitions.component";
import {CompetitionComponent} from "./components/competition/competition.component";
import {CompetitionsRoutingModule} from "./competitions-routing.module";
import {FormsModule, ReactiveFormsModule} from "@angular/forms";
import {NgIcon} from "@ng-icons/core";
import { QrCodeModule } from 'ng-qrcode';



@NgModule({
  declarations: [CompetitionsComponent,CompetitionComponent],
  imports: [
    CommonModule,
    CompetitionsRoutingModule,
    FormsModule,
    ReactiveFormsModule,
    ReactiveFormsModule,
    NgIcon,
    QrCodeModule,
    NgIf,
    NgForOf,
    NgIcon,
    NgIcon
  ]
})
export class CompetitionsModule { }