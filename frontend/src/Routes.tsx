import { BrowserRouter, Route, Switch } from "react-router-dom";
import Navbar from "./components/Navbar";
import Login from "./pages/Public/Login";

const Routes = () => (
  <BrowserRouter>
    <Navbar />
    <Switch>
        <Route path="/">
            <Login />
        </Route>
    </Switch>
  </BrowserRouter>
);

export default Routes;
