<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 7/13/2018
  Time: 2:24 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
    <link href="resources/css/Style.css" rel="stylesheet" type="text/css" media="all" />

    <link href="resources/css/bootstrap.css" rel="stylesheet" type="text/css" media="all" />
    <link href="resources/css/flexslider.css" rel="stylesheet" type="text/css" media="all" />
  </head>
  <body>

  <div class="agileits_header">
    <div class="w3l_offers">
      <a href="#">Welcome to Pharmacy InfoSys</a>
    </div>
    <div class="w3l_search">
      <form action="#" method="post">
        <input type="text" name="Product" placeholder="Search a product..."  required="">
        <input type="submit" value=" ">
      </form>
    </div>
    <%--<div class="product_list_header">--%>
      <%--<form action="#" method="post" class="last">--%>
        <%--<fieldset>--%>
          <%--<input type="hidden" name="cmd" value="_cart" />--%>
          <%--<input type="hidden" name="display" value="1" />--%>
          <%--<input type="submit" name="submit" value="View your cart" class="button" />--%>
        <%--</fieldset>--%>
      <%--</form>--%>
    <%--</div>--%>
    <%--<div class="w3l_header_right">--%>
      <%--<ul>--%>
        <%--<li class="dropdown profile_details_drop">--%>
          <%--<a href="#" class="dropdown-toggle" data-toggle="dropdown"><em class="fa fa-user" aria-hidden="true"></em><span class="caret"></span></a>--%>
          <%--<div class="mega-dropdown-menu">--%>
            <%--<div class="w3ls_vegetables">--%>
              <%--<ul class="dropdown-menu drp-mnu">--%>
                <%--<li><a href="login.html">Login</a></li>--%>
                <%--<li><a href="login.html">Sign Up</a></li>--%>
              <%--</ul>--%>
            <%--</div>--%>
          <%--</div>--%>
        <%--</li>--%>
      <%--</ul>--%>
    <%--</div>--%>
    <%--<div class="w3l_header_right1">--%>
      <%--<h2><a href="mail.html">Contact Us</a></h2>--%>
    <%--</div>--%>













































    <div class="clearfix"> </div>
  </div>

  <!-- top-brands -->
  <div class="top-brands">
    <div class="container">
      <h3>Hot Offers</h3>
      <div class="agile_top_brands_grids">
        <div class="col-md-3 top_brand_left">
          <div class="hover14 column">
            <div class="agile_top_brand_left_grid">
              <div class="tag"><img src="resources/img/tag.png" alt="" class="img-responsive" /></div>
              <div class="agile_top_brand_left_grid1">
                <figure>
                  <div class="snipcart-item block" >
                    <div class="snipcart-thumb">
                      <a href="single.html"><img title=" " alt=" " src="resources/img/1.png" /></a>
                      <p>fortune sunflower oil</p>
                      <h4>$7.99 <span>$10.00</span></h4>
                    </div>
                    <div class="snipcart-details top_brand_home_details">
                      <form action="checkout.html" method="post">
                        <fieldset>
                          <input type="hidden" name="cmd" value="_cart" />
                          <input type="hidden" name="add" value="1" />
                          <input type="hidden" name="business" value=" " />
                          <input type="hidden" name="item_name" value="Fortune Sunflower Oil" />
                          <input type="hidden" name="amount" value="7.99" />
                          <input type="hidden" name="discount_amount" value="1.00" />
                          <input type="hidden" name="currency_code" value="USD" />
                          <input type="hidden" name="return" value=" " />
                          <input type="hidden" name="cancel_return" value=" " />
                          <input type="submit" name="submit" value="Add to cart" class="button" />
                        </fieldset>

                      </form>

                    </div>
                  </div>
                </figure>
              </div>
            </div>
          </div>
        </div>
        <div class="col-md-3 top_brand_left">
          <div class="hover14 column">
            <div class="agile_top_brand_left_grid">
              <div class="agile_top_brand_left_grid1">
                <figure>
                  <div class="snipcart-item block" >
                    <div class="snipcart-thumb">
                      <a href="single.html"><img title=" " alt=" " src="images/3.png" /></a>
                      <p>basmati rise (5 Kg)</p>
                      <h4>$11.99 <span>$15.00</span></h4>
                    </div>
                    <div class="snipcart-details top_brand_home_details">
                      <form action="#" method="post">
                        <fieldset>
                          <input type="hidden" name="cmd" value="_cart" />
                          <input type="hidden" name="add" value="1" />
                          <input type="hidden" name="business" value=" " />
                          <input type="hidden" name="item_name" value="basmati rise" />
                          <input type="hidden" name="amount" value="11.99" />
                          <input type="hidden" name="discount_amount" value="1.00" />
                          <input type="hidden" name="currency_code" value="USD" />
                          <input type="hidden" name="return" value=" " />
                          <input type="hidden" name="cancel_return" value=" " />
                          <input type="submit" name="submit" value="Add to cart" class="button" />
                        </fieldset>
                      </form>
                    </div>
                  </div>
                </figure>
              </div>
            </div>
          </div>
        </div>
        <div class="col-md-3 top_brand_left">
          <div class="hover14 column">
            <div class="agile_top_brand_left_grid">
              <div class="agile_top_brand_left_grid_pos">
                <img src="images/offer.png" alt=" " class="img-responsive" />
              </div>
              <div class="agile_top_brand_left_grid1">
                <figure>
                  <div class="snipcart-item block">
                    <div class="snipcart-thumb">
                      <a href="single.html"><img src="images/2.png" alt=" " class="img-responsive" /></a>
                      <p>Pepsi soft drink (2 Ltr)</p>
                      <h4>$8.00 <span>$10.00</span></h4>
                    </div>
                    <div class="snipcart-details top_brand_home_details">
                      <form action="#" method="post">
                        <fieldset>
                          <input type="hidden" name="cmd" value="_cart" />
                          <input type="hidden" name="add" value="1" />
                          <input type="hidden" name="business" value=" " />
                          <input type="hidden" name="item_name" value="Pepsi soft drink" />
                          <input type="hidden" name="amount" value="8.00" />
                          <input type="hidden" name="discount_amount" value="1.00" />
                          <input type="hidden" name="currency_code" value="USD" />
                          <input type="hidden" name="return" value=" " />
                          <input type="hidden" name="cancel_return" value=" " />
                          <input type="submit" name="submit" value="Add to cart" class="button" />
                        </fieldset>
                      </form>
                    </div>
                  </div>
                </figure>
              </div>
            </div>
          </div>
        </div>
        <div class="col-md-3 top_brand_left">
          <div class="hover14 column">
            <div class="agile_top_brand_left_grid">
              <div class="agile_top_brand_left_grid_pos">
                <img src="images/offer.png" alt=" " class="img-responsive" />
              </div>
              <div class="agile_top_brand_left_grid1">
                <figure>
                  <div class="snipcart-item block">
                    <div class="snipcart-thumb">
                      <a href="single.html"><img src="images/4.png" alt=" " class="img-responsive" /></a>
                      <p>dogs food (4 Kg)</p>
                      <h4>$9.00 <span>$11.00</span></h4>
                    </div>
                    <div class="snipcart-details top_brand_home_details">
                      <form action="#" method="post">
                        <fieldset>
                          <input type="hidden" name="cmd" value="_cart" />
                          <input type="hidden" name="add" value="1" />
                          <input type="hidden" name="business" value=" " />
                          <input type="hidden" name="item_name" value="dogs food" />
                          <input type="hidden" name="amount" value="9.00" />
                          <input type="hidden" name="discount_amount" value="1.00" />
                          <input type="hidden" name="currency_code" value="USD" />
                          <input type="hidden" name="return" value=" " />
                          <input type="hidden" name="cancel_return" value=" " />
                          <input type="submit" name="submit" value="Add to cart" class="button" />
                        </fieldset>
                      </form>
                    </div>
                  </div>
                </figure>
              </div>
            </div>
          </div>
        </div>
        <div class="clearfix"> </div>
      </div>
    </div>
  </div>
  <!-- //top-brands -->
  </body>
</html>
