Feature: Validar funcionalidades de búsqueda, registro, versiones y comparativas de revisiones en Wikipedia

  Background: Ingresar a la página principal de Wikipedia
   Given el usuario ingresa a la página de Wikipedia

  @Test1
  Scenario: Validar el título en la página de inicio
    Then el usuario valida que el título sea Bienvenidos a Wikipedia,

  @Test2
  Scenario: Validar el título de la palabra buscada
    When el usuario realiza búsqueda de la palabra Sistema
    Then el título de la búsqueda debe coincidir con Sistema

  @Test3
  Scenario: Validar el título "Análisis CEEM" dentro de los resultados
    When el usuario realiza búsqueda de la palabra Sistema
    And el usuario desplaza el contenido en busca de Análisis CEEM
    Then el usuario valida que en los resultados se encuentra Análisis CEEM

  @Test4
  Scenario Outline: Diligenciar el formulario de registro sin CAPTCHA
    When el usuario selecciona la opción Crear una cuenta
    And el usuario diligencia el formulario de registro sin CAPTCHA
      | <nombre> | <contrasena> | <correo electronico> |
    Then el usuario valida que se presente el pop up Completa este campo en el campo del CAPTCHA

    Examples:
      | nombre          | contrasena | correo electronico        |
      | CarlosQAPruebas | Valid123*  | carlosqapruebas@valid.com |

  @Test5
  Scenario: Cambiar entre versión móvil y de escritorio
    When el usuario desde la parte inferior de la página selecciona la opción Versión para móviles
    Then el usuario valida que se encuentre la opción Escritorio
    And el usuario regresa a esta versión


  @Test6
  Scenario: Comparar dos revisiones en el historial
    When el usuario ingresa a la opción Ver historial
    And el usuario selecciona dos RADIO BUTTON
    And el usuario hace clic en el botón Comparar revisiones seleccionadas
    Then el usuario valida que existan dos campos de texto para comparar las revisiones