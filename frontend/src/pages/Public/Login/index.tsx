import "./styles.css";
import { ReactComponent as LoginImg } from "assets/images/login.svg"

const Login = () => {
  return (
    <div className="login-container">
        <div className="login-image">
            <h1>Avalie Filmes</h1>
            <p>Diga o que você achou do seu filme favorito</p>
            <LoginImg />
        </div>
      <div className="login-form-container">
        <h1>LOGIN</h1>
        <form className="login-form">
          <input type="text" name="email" placeholder="E-mail" />
          <input type="password" name="password" placeholder="Senha" />
          <button type="submit" className="login-button">FAZER LOGIN</button>
        </form>
      </div>
    </div>
  );
};

export default Login;
