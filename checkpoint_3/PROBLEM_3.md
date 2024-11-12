# Checkpoint 3

- Problema: API para cálculo de similaridade gênica
- Grupo: 2 a 4 pessoas
- Data de publicação: 15/10/2024
- Data limite de entrega: 11/11/2024
- Email de contato: proffellipe.souto@fiap.com.br

Com o fim da Sprint 1 nosso chefe nos convocou para uma nova reunião. Nessa reunião foi apresentado um novo produto de software solicitado pelos stakeholdes, uma API que avalia as similaridade e distâncias entre dois seres vivos, através de suas cadeias de nucleotídeos.

Para versão preliminar desse projeto consideraremos apenas 1 endpoint, que será descrito a seguir: 

```
PROTOCOLO: HTTP
PATH: /v1/alignment/distance
MÉTODO: POST
INPUT TYPE: JSON
OUTPUT TYPE: JSON

INPUT SCHEMA:
{
    "tracing_uuid": "8fbf1e92-032c-4172-93ce-a5e56a708dd7",
    "format": "plain_text",
    "method": "DEFAULT",
    "sequences": [
        {
            "sequence_uuid": "5edd3a6b-7a50-4fe1-9abd-7766bdc5779f",
            "sequence": "ACTGACTGACTG"
        },
        {
            "sequence_uuid": "d60e0c41-0926-481d-a468-f68bc224ecde",
            "sequence": "ACTGACTGACTT"
        }
    ]
}

OUTPUT SCHEMA:
{
    "tracing_id": "8fbf1e92-032c-4172-93ce-a5e56a708dd7",
    "alignment_uuid: "f5f8718b-6add-4e73-b8d0-79f0d5aab70a",
    "method": {
        "name": "HAMMING_DISTANCE",
        "about: "The Hamming Distance measures the difference between two strings of equal length by counting the number of positions where the corresponding characters differ. It is commonly used in error detection, bioinformatics, cryptography, and machine learning to assess similarity or detect changes. For example, the Hamming Distance between "ACGT" and "ACGG" is 1, as only the last character differs.",
        "refences" : [
            "https://www.sciencedirect.com/topics/computer-science/hamming-distance",
            "https://en.wikipedia.org/wiki/Hamming_distance"
        ]
    },
    result: [
        {
            "distance_score": 1.00,
            "similarity_score": 0.9375,
            "observations" : [],
            "length": 16,
            "format": "plain_text",
            "processing_time": "0.005s"
            "created_at": "2024-10-15T19:30:59.823381 (GMT-03:00)"
            "status": "PROCESSED"
        }
    ]
    "status": "PROCESSED"
    "created_at": "2024-10-15T19:20:00.823381 (GMT-03:00)"
    "updated_at": "2024-10-15T19:30:59.000000 (GMT-03:00)"
}
```

Esse trabalho será desenvolvido por mim em sala de aula e replicada por vocês. Cada pessoa deve tentar implementar sua própria versão e commitar em uma Branch separada do grupo. Todos devem discutir e chegar a um consenso sobre qual implementação será aceita, lidando com possíveis conflitos de design no código.

O principal ponto avaliado nesse trabalho será a colaboração que vocês tiveram no github.

## Diretrizes para entrega do trabalho:

O presente trabalho terá sua nota dividida da seguinte forma:

- CÓDIGO: 100% de Peso

Serão aceitos grupos de 2 a 4 pessoas, grupos individuais serão aceitos caso a caso. A correção do código será feita levando em consideração os seguintes pontos:

- Organização do código
- Legibilidade do código
- Corretudo do código
- Completude do código
- Tratamento de erros
- Testes manuais e automatizados
- Documentação do código e projeto

O intuito desse trabalho era implementar toda a específicação apresentada acima. Entretanto, por conta do tempo só foi possível construir parte do projeto. O último commit feito em sala e que irei cobrar é o [cfeda072](https://github.com/fllsouto/check_point_fiap_esp_wx_s2_2024/commit/cfeda072892140e7defd1c359785a5043876c5a5), use ele como referência. Portanto, seu grupo deverá implementar o projeto até esse ponto, caso vocês queiram ir além e implementar mais coisas, fiquem a vontade, mas não se esqueçam de implementar primeiro o que foi dado em sala de aula.

## Dicas e Considerações

- Estude os commits e códigos produzidos nas aulas.
- Discutam em grupo, apenas em consenso chegamos às melhores ideias.
- Não use chatGPT ou qualquer tipo de IA/ML, chatbot, LLM ou coisa afim. Seu uso acarretará em zero para todo o grupo.
- Não será tolerado plágios, um cientista de verdade compartilha e referencia suas fontes de forma correta. Não se constrói a Ciência de forma sozinha, apenas em comunidade. Faremos isso com cortêsia e consideração por aqueles que vieram antes de nós. Esse é o pensamento científico que adotaremos nessa e nas atividades futuras.
- Tirem dúvidas por e-mail comigo, costumo responder rápido
- Conversem entre vocês, mas não copiem um dos outros, isso também é plágio ;) .
- Se divirtam, esse é o objetivo final da ciência e desse trabalho:).

# Atualizações

- 18/10: Transformei o checkpoint 2.2 em checkpoint 3
- 10/11/2024: Adicionei a seção **Diretrizes para entrega do trabalho** e **Dicas e Considerações**