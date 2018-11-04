import { Component, OnInit } from '@angular/core';

import { SgtkinService } from '../util/sgtkin.service';

@Component({
  selector: 'app-sgtkin',
  templateUrl: './sgtkin.component.html',
  styleUrls: ['./sgtkin.component.css']
})
export class SgtkinComponent implements OnInit {

  displayedColumns: string[] = ['id'];
  sgtkins: Array<any>;

  constructor(private sgtkinService: SgtkinService) { }

  ngOnInit() {
    this.sgtkinService.getAll().subscribe(data => {
      this.sgtkins = data;
    });
  }

}
