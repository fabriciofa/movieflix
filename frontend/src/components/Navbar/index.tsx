import "./styles.css";

const Navbar = () => {
  return (
    <nav className="main-nav-container">
      <a href="#link">
        <h1>MovieFlix</h1>
      </a>
      <div>
        <a href="#link" className="nav-button">
          SAIR
        </a>
      </div>
    </nav>
  );
};

export default Navbar;
