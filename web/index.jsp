<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <link rel="stylesheet" href="css/style.css" />
    <title>Inicio - Caninos y Felinos</title>
  </head>
  <body>
    <header class="cabecera_principal">
      <%@include file="banner_principal.jsp" %> 
      <%@include file="barra_navegacion.jsp" %>
      <!--Baner principal-->
      <%//@include file="banner_principal.jsp" %>
      <!--<section class="hero">
        <a href="/SaludPet">
          <section>
            <h1>
              <span>Centro veterinario</span>
              <span class="titulo">caninos y </span>
              <span class="titulo felinos">felinos</span>
            </h1>
          </section>
        </a>
        <section class="decoracion_hero">
          <img src="img/perro.webp" alt="perro" />
          <img
            src="img/gato.webp"
            alt="gato"
          />
        </section>
      </section>-->
      <!--Comentar para solo incluir una sola linea en todos los html-->
      <%//@include file="barra_navegacion.jsp" %>
      <!--<section class="contenedor_navegacion">
        <nav>
          <ul>
              <li><a href="Servicio.jsp">Servicios</a></li>
              <li><a href="Productos.jsp">Productos</a></li>
              <li><a href="Guarderia.jsp">Guarderia</a></li>
              <li><a href="Promociones.jsp">Promociones</a></li>
          </ul>
        </nav>
      </section>-->
    </header>
    <main id="contenido_principal">
      <section class="seccion_info">
        <article class="cuadro_info">
          <header>
            <p>Cuidados y Educacion para su perro</p>
          </header>
          <main>
            <section class="contenido">
              <span>
                <p>
                  Lorem ipsum dolor sit amet consectetur adipisicing elit. Vel
                  ea excepturi cumque quo sunt distinctio, nulla laboriosam
                  placeat assumenda pariatur in repudiandae tenetur molestias
                  corporis voluptas temporibus, alias, exercitationem aut!
                </p>
                <p>
                  Lorem ipsum dolor sit a Fmet consectetur adipisicing elit.
                  Beatae, autem.
                </p>
              </span>
              <p>ver mas...</p>
            </section>
            <section>
              <img src="https://placehold.jp/150x150.png" alt="perro1" />
            </section>
          </main>
        </article>
        <article class="cuadro_info">
          <header>
            <p>Salir de Viaje con su Mascota</p>
          </header>
          <main>
            <section class="contenido">
              <span>
                <p>
                  Lorem ipsum dolor sit amet consectetur adipisicing elit. Vel
                  ea excepturi cumque quo sunt distinctio, nulla laboriosam
                  placeat assumenda pariatur in repudiandae tenetur molestias
                  corporis voluptas temporibus, alias, exercitationem aut!
                </p>
                <p>
                  Lorem ipsum dolor sit a Fmet consectetur adipisicing elit.
                  Beatae, autem.
                </p>
              </span>
              <p>ver mas...</p>
            </section>
            <section>
              <img src="https://placehold.jp/150x150.png" alt="perro1" />
            </section>
          </main>
        </article>
      </section>
      <section class="seccion_cita_medica">
        <form>
          <header>
            <p>Solicitar Cita Medica</p>
          </header>
          <main>
            <label>mascota</label>
            <input type="text" />
            <label>Edad</label>
            <input type="number" />
            <label>Raza</label>
            <input type="text" />
            <label>Fecha</label>
            <input type="date" />
            <label>Hora</label>
            <input type="text" />
            <label>Amo</label>
            <input type="text" />
          </main>
          <footer>
            <button type="button">validar Cita</button>
          </footer>
        </form>
      </section>
    </main>
    <footer>
      <p>Contanctenos</p>
      <p>Linea gratuita 018000-00001</p>
      <p>Correo: Preguntas@caninosyfelinos.com</p>
    </footer>
  </body>
</html>
