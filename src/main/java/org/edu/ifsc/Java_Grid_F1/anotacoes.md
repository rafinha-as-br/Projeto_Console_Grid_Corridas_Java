Base do sistema: O usuário informa equipes, pilotos e resultado de corridas, e irá 
imprimir o resultado de uma corrida, do campeonato e listas de equipes e pilotos


Classes:

Piloto
└── nome
└── numero
└── Equipe
└── pontos

Equipe
└── nome
└── pontos
└── Piloto 1
└── Piloto 2

Corrida
└── nome
└── local
└── resultados (lista que guarda a posição)
└── Override em todas as funções da interface


Campeonato implements interfaceFIA
└── listaDeCorridas
└── listaDeEquipes
└── listaDePilotos
└── Override em todas as funções da interface

GerenciadorMenu(classe controladora do sistema geral)
└── Controlar o menu e as instâncias de campeonato


Interface: 

Interface FIA (chamada de métodos apenas)
└── Calcular pontuações de corrida
└── Exibir resultado de uma corrida (impressão)
└── Exibir resultado campeonato
