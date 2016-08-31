(ns pier-sdk-clojure.api.status-cart-o
  (:require [pier-sdk-clojure.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn consultar-status-cartao-using-get-with-http-info
  "Apresenta os dados de um determinado Status CartÃ£o
  Este mÃ©todo permite consultar os parÃ¢metros de um determinado Status de CartÃ£o a partir do seu cÃ³digo de identificaÃ§Ã£o (id)."
  [id-status-cartao ]
  (call-api "/api/status-cartoes/{id_status_cartao}" :get
            {:path-params   {"id_status_cartao" id-status-cartao }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["access_token"]}))

(defn consultar-status-cartao-using-get
  "Apresenta os dados de um determinado Status CartÃ£o
  Este mÃ©todo permite consultar os parÃ¢metros de um determinado Status de CartÃ£o a partir do seu cÃ³digo de identificaÃ§Ã£o (id)."
  [id-status-cartao ]
  (:data (consultar-status-cartao-using-get-with-http-info id-status-cartao)))

(defn listar-status-cartoes-using-get-with-http-info
  "Lista as opÃ§Ãµes de Status do CartÃ£o
  Este mÃ©todo permite que sejam listadas as possibilidades de Status que podem ser atribuÃ­das aos CartÃµes."
  ([] (listar-status-cartoes-using-get-with-http-info nil))
  ([{:keys [id nome flag-altera-status flag-cancela-no-desbloqueio id-status-destino-desbloqueio flag-cancela-conta id-status-destino-conta flag-cobra-tarifa flag-reemite-cartao flag-emite-provisorio flag-cadastro-nova-senha flag-origem-transferencia flag-destino-transferencia flag-excecao-bandeira page limit ]}]
   (call-api "/api/status-cartoes" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"id" id "nome" nome "flagAlteraStatus" flag-altera-status "flagCancelaNoDesbloqueio" flag-cancela-no-desbloqueio "idStatusDestinoDesbloqueio" id-status-destino-desbloqueio "flagCancelaConta" flag-cancela-conta "idStatusDestinoConta" id-status-destino-conta "flagCobraTarifa" flag-cobra-tarifa "flagReemiteCartao" flag-reemite-cartao "flagEmiteProvisorio" flag-emite-provisorio "flagCadastroNovaSenha" flag-cadastro-nova-senha "flagOrigemTransferencia" flag-origem-transferencia "flagDestinoTransferencia" flag-destino-transferencia "flagExcecaoBandeira" flag-excecao-bandeira "page" page "limit" limit }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["access_token"]})))

(defn listar-status-cartoes-using-get
  "Lista as opÃ§Ãµes de Status do CartÃ£o
  Este mÃ©todo permite que sejam listadas as possibilidades de Status que podem ser atribuÃ­das aos CartÃµes."
  ([] (listar-status-cartoes-using-get nil))
  ([optional-params]
   (:data (listar-status-cartoes-using-get-with-http-info optional-params))))