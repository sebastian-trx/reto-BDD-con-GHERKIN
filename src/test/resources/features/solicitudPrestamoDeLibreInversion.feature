#language: es

  Característica: Solicitar un prestamo de libre inversion

    @smokeTest @QA @solicitudDePrestamoDeLibreInversion
    Escenario: solicitud de prestamo exitosa
      Dado que soy un cliente registrado
      Cuando el cliente llena el formulario de solicitud de prestramo de libre inversion con todos los datos solicitados
      Y el cliente envia la solicitud
      Entonces se le notifica al cliente que su solicitud ha sido aprobada
      Y se le proporciona informacion sobre el prestamo

    @smokeTest @QA @solicitudDePrestamoDeLibreInversion
    Escenario: solicitud de prestamo fallida por historial crediticio negativo
      Dado que soy un cliente registrado
      Cuando  el cliente llena el formulario de solicitud de prestramo de libre inversion con todos los datos solicitados
      Y el cliente envia la solicitud
      Entonces  se le notifica al cliente que su solicitud no ha sido aprobada debido a su historial crediticio negativo

    @smokeTest @QA @solicitudDePrestamoDeLibreInversion
    Escenario: solicitud de prestamo fallida por capacidad de pago insuficiente
      Dado que soy un cliente registrado
      Cuando  el cliente llena el formulario de solicitud de prestramo de libre inversion con todos los datos solicitados
      Y  el cliente envia la solicitud
      Entonces  se le notifica al cliente que su solicitud no ha sido aprobada debido a que su capacidad de pago es insuficiente

    @smokeTest @QA @solicitudDePrestamoDeLibreInversion
    Escenario: error dejando un campo obligatorio vacio al llenar el formulario de solicitud de prestamo de libre inversion
      Dado que soy un cliente registrado
      Cuando  el cliente llena el formulario de solicitud de prestamos en libre inversion dejando un campo obligatorio vacio
      Y  el cliente envia la solicitud
      Entonces  se le notifica al cliente que no puede enviar su solicitud debido ha que ha dejado campos obligatorios vacios






