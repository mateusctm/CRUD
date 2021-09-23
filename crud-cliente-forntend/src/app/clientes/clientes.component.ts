import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-clientes',
  templateUrl: './clientes.component.html',
  styleUrls: ['./clientes.component.css'],
})
export class ClientesComponent implements OnInit {
  clientes = [
    {
      nome: 'mateus',
      cpf: '06623996176',
      endereco: {
        CEP: '72215039',
        logradouro: 'qnm3comj i',
        bairro: 'ceilandia sul',
        cidade: 'brasilia',
        uf: 'DF',
      },
      telefone: '99999999',
      email: 'MATEUS@GMAIL.COM',
    },
  ];

  constructor() {}

  ngOnInit(): void {}

  onEdit() {}

  onDelete() {}
}
