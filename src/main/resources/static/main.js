(window["webpackJsonp"] = window["webpackJsonp"] || []).push([["main"],{

/***/ "./src/$$_lazy_route_resource lazy recursive":
/*!**********************************************************!*\
  !*** ./src/$$_lazy_route_resource lazy namespace object ***!
  \**********************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

function webpackEmptyAsyncContext(req) {
	// Here Promise.resolve().then() is used instead of new Promise() to prevent
	// uncaught exception popping up in devtools
	return Promise.resolve().then(function() {
		var e = new Error("Cannot find module '" + req + "'");
		e.code = 'MODULE_NOT_FOUND';
		throw e;
	});
}
webpackEmptyAsyncContext.keys = function() { return []; };
webpackEmptyAsyncContext.resolve = webpackEmptyAsyncContext;
module.exports = webpackEmptyAsyncContext;
webpackEmptyAsyncContext.id = "./src/$$_lazy_route_resource lazy recursive";

/***/ }),

/***/ "./src/app/app-routing.module.ts":
/*!***************************************!*\
  !*** ./src/app/app-routing.module.ts ***!
  \***************************************/
/*! exports provided: AppRoutingModule */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "AppRoutingModule", function() { return AppRoutingModule; });
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
/* harmony import */ var _angular_router__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! @angular/router */ "./node_modules/@angular/router/fesm5/router.js");
/* harmony import */ var _identification_connexion_connexion_component__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! ./identification/connexion/connexion.component */ "./src/app/identification/connexion/connexion.component.ts");
/* harmony import */ var _identification_inscription_inscription_component__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(/*! ./identification/inscription/inscription.component */ "./src/app/identification/inscription/inscription.component.ts");
/* harmony import */ var _guard_auth_guard__WEBPACK_IMPORTED_MODULE_4__ = __webpack_require__(/*! ./guard/auth.guard */ "./src/app/guard/auth.guard.ts");
var __decorate = (undefined && undefined.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};





var routes = [
    { path: '', redirectTo: 'connexion', pathMatch: 'full', canActivate: [_guard_auth_guard__WEBPACK_IMPORTED_MODULE_4__["AuthGuard"]] },
    { path: 'connexion', component: _identification_connexion_connexion_component__WEBPACK_IMPORTED_MODULE_2__["ConnexionComponent"] },
    { path: 'inscription', component: _identification_inscription_inscription_component__WEBPACK_IMPORTED_MODULE_3__["InscriptionComponent"], canActivate: [_guard_auth_guard__WEBPACK_IMPORTED_MODULE_4__["AuthGuard"]] }
];
var AppRoutingModule = /** @class */ (function () {
    function AppRoutingModule() {
    }
    AppRoutingModule = __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["NgModule"])({
            imports: [_angular_router__WEBPACK_IMPORTED_MODULE_1__["RouterModule"].forRoot(routes)],
            exports: [_angular_router__WEBPACK_IMPORTED_MODULE_1__["RouterModule"]]
        })
    ], AppRoutingModule);
    return AppRoutingModule;
}());



/***/ }),

/***/ "./src/app/app.component.css":
/*!***********************************!*\
  !*** ./src/app/app.component.css ***!
  \***********************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = " \n /**\n  * Header CSS\n  */\n header {\n   position: fixed;\n   top: 0;\n   right: 0;\n   left: 0;\n   z-index: 2;\n }\n header ul.mui-list--inline {\n   margin-bottom: 0;\n }\n header a {\n   color: white;\n }\n header table {\n   width: 100%;\n }\n /**\n  * Content CSS\n  */\n #content-wrapper {\n   min-height: 100%;\n \n   /* sticky footer */\n   box-sizing: border-box;\n   margin-bottom: -100px;\n   padding-bottom: 100px;\n }\n /**\n  * Footer CSS\n  */\n footer {\n   box-sizing: border-box;\n   height: 100px;\n   background-color: #eee;\n   border-top: 1px solid #e0e0e0;\n   padding-top: 35px;\n }\n/*# sourceMappingURL=data:application/json;base64,eyJ2ZXJzaW9uIjozLCJzb3VyY2VzIjpbInNyYy9hcHAvYXBwLmNvbXBvbmVudC5jc3MiXSwibmFtZXMiOltdLCJtYXBwaW5ncyI6IjtDQUNDOztJQUVHO0NBQ0g7R0FDRSxnQkFBZ0I7R0FDaEIsT0FBTztHQUNQLFNBQVM7R0FDVCxRQUFRO0dBQ1IsV0FBVztFQUNaO0NBRUQ7R0FDRSxpQkFBaUI7RUFDbEI7Q0FFRDtHQUNFLGFBQWE7RUFDZDtDQUVEO0dBQ0UsWUFBWTtFQUNiO0NBR0Q7O0lBRUc7Q0FDSDtHQUNFLGlCQUFpQjs7R0FFakIsbUJBQW1CO0dBQ25CLHVCQUF1QjtHQUN2QixzQkFBc0I7R0FDdEIsc0JBQXNCO0VBQ3ZCO0NBR0Q7O0lBRUc7Q0FDSDtHQUNFLHVCQUF1QjtHQUN2QixjQUFjO0dBQ2QsdUJBQXVCO0dBQ3ZCLDhCQUE4QjtHQUM5QixrQkFBa0I7RUFDbkIiLCJmaWxlIjoic3JjL2FwcC9hcHAuY29tcG9uZW50LmNzcyIsInNvdXJjZXNDb250ZW50IjpbIiBcbiAvKipcbiAgKiBIZWFkZXIgQ1NTXG4gICovXG4gaGVhZGVyIHtcbiAgIHBvc2l0aW9uOiBmaXhlZDtcbiAgIHRvcDogMDtcbiAgIHJpZ2h0OiAwO1xuICAgbGVmdDogMDtcbiAgIHotaW5kZXg6IDI7XG4gfVxuIFxuIGhlYWRlciB1bC5tdWktbGlzdC0taW5saW5lIHtcbiAgIG1hcmdpbi1ib3R0b206IDA7XG4gfVxuIFxuIGhlYWRlciBhIHtcbiAgIGNvbG9yOiB3aGl0ZTtcbiB9XG4gXG4gaGVhZGVyIHRhYmxlIHtcbiAgIHdpZHRoOiAxMDAlO1xuIH1cbiBcbiBcbiAvKipcbiAgKiBDb250ZW50IENTU1xuICAqL1xuICNjb250ZW50LXdyYXBwZXIge1xuICAgbWluLWhlaWdodDogMTAwJTtcbiBcbiAgIC8qIHN0aWNreSBmb290ZXIgKi9cbiAgIGJveC1zaXppbmc6IGJvcmRlci1ib3g7XG4gICBtYXJnaW4tYm90dG9tOiAtMTAwcHg7XG4gICBwYWRkaW5nLWJvdHRvbTogMTAwcHg7XG4gfVxuIFxuIFxuIC8qKlxuICAqIEZvb3RlciBDU1NcbiAgKi9cbiBmb290ZXIge1xuICAgYm94LXNpemluZzogYm9yZGVyLWJveDtcbiAgIGhlaWdodDogMTAwcHg7XG4gICBiYWNrZ3JvdW5kLWNvbG9yOiAjZWVlO1xuICAgYm9yZGVyLXRvcDogMXB4IHNvbGlkICNlMGUwZTA7XG4gICBwYWRkaW5nLXRvcDogMzVweDtcbiB9Il19 */"

/***/ }),

/***/ "./src/app/app.component.html":
/*!************************************!*\
  !*** ./src/app/app.component.html ***!
  \************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "<header class=\"mui-appbar mui--z1\">\n    <!-- Appbar HTML goes here -->\n    <div class=\"mui-container\">\n        <table>\n            <tr class=\"mui--appbar-height\">\n            <td class=\"mui--text-title\">Brand.io</td>\n            <td class=\"mui--text-right\">\n                <ul class=\"mui-list--inline mui--text-body2\">\n                <li><a href=\"#\">About</a></li>\n                <li><a routerLink=\"/inscription\" routerLinkActive=\"active\">inscription</a></li>\n                <li><a routerLink=\"/connexion\" routerLinkActive=\"active\">connection</a></li>\n                </ul>\n            </td>\n            </tr>\n        </table>\n    </div>\n</header>\n<div id=\"content-wrapper\" class=\"mui--text-center\">\n    <!-- Content HTML goes here -->\n    <div class=\"mui--appbar-height\"></div>\n    <br>\n    <br>\n    <div class=\"mui--text-display3\">Brand.io</div>\n    <br>\n    <br>\n    <button class=\"mui-btn mui-btn--raised\">Get started</button>\n    <br>\n    <br>\n    <router-outlet></router-outlet>\n\n</div>\n<footer>\n    <div class=\"mui-container mui--text-center\">\n        Made with ♥ by <a href=\"https://www.muicss.com\">MUICSS</a>\n    </div>\n</footer>\n\n\n"

/***/ }),

/***/ "./src/app/app.component.ts":
/*!**********************************!*\
  !*** ./src/app/app.component.ts ***!
  \**********************************/
/*! exports provided: AppComponent */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "AppComponent", function() { return AppComponent; });
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
var __decorate = (undefined && undefined.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};

var AppComponent = /** @class */ (function () {
    function AppComponent() {
        this.title = 'gofootapp-fe';
    }
    AppComponent = __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["Component"])({
            selector: 'app-root',
            template: __webpack_require__(/*! ./app.component.html */ "./src/app/app.component.html"),
            styles: [__webpack_require__(/*! ./app.component.css */ "./src/app/app.component.css")]
        })
    ], AppComponent);
    return AppComponent;
}());



/***/ }),

/***/ "./src/app/app.module.ts":
/*!*******************************!*\
  !*** ./src/app/app.module.ts ***!
  \*******************************/
/*! exports provided: AppModule */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "AppModule", function() { return AppModule; });
/* harmony import */ var _angular_platform_browser__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/platform-browser */ "./node_modules/@angular/platform-browser/fesm5/platform-browser.js");
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
/* harmony import */ var _app_routing_module__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! ./app-routing.module */ "./src/app/app-routing.module.ts");
/* harmony import */ var _app_component__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(/*! ./app.component */ "./src/app/app.component.ts");
/* harmony import */ var _angular_platform_browser_animations__WEBPACK_IMPORTED_MODULE_4__ = __webpack_require__(/*! @angular/platform-browser/animations */ "./node_modules/@angular/platform-browser/fesm5/animations.js");
/* harmony import */ var _angular_flex_layout__WEBPACK_IMPORTED_MODULE_5__ = __webpack_require__(/*! @angular/flex-layout */ "./node_modules/@angular/flex-layout/esm5/flex-layout.es5.js");
/* harmony import */ var _angular_material__WEBPACK_IMPORTED_MODULE_6__ = __webpack_require__(/*! @angular/material */ "./node_modules/@angular/material/esm5/material.es5.js");
/* harmony import */ var _angular_forms__WEBPACK_IMPORTED_MODULE_7__ = __webpack_require__(/*! @angular/forms */ "./node_modules/@angular/forms/fesm5/forms.js");
/* harmony import */ var _identification_connexion_connexion_component__WEBPACK_IMPORTED_MODULE_8__ = __webpack_require__(/*! ./identification/connexion/connexion.component */ "./src/app/identification/connexion/connexion.component.ts");
/* harmony import */ var _identification_inscription_inscription_component__WEBPACK_IMPORTED_MODULE_9__ = __webpack_require__(/*! ./identification/inscription/inscription.component */ "./src/app/identification/inscription/inscription.component.ts");
/* harmony import */ var _angular_common_http__WEBPACK_IMPORTED_MODULE_10__ = __webpack_require__(/*! @angular/common/http */ "./node_modules/@angular/common/fesm5/http.js");
/* harmony import */ var _service_login_login_service__WEBPACK_IMPORTED_MODULE_11__ = __webpack_require__(/*! ./service/login/login.service */ "./src/app/service/login/login.service.ts");
/* harmony import */ var _service_config_configuration_service__WEBPACK_IMPORTED_MODULE_12__ = __webpack_require__(/*! ./service/config/configuration.service */ "./src/app/service/config/configuration.service.ts");
var __decorate = (undefined && undefined.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};













var AppModule = /** @class */ (function () {
    function AppModule() {
    }
    AppModule = __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_1__["NgModule"])({
            declarations: [
                _app_component__WEBPACK_IMPORTED_MODULE_3__["AppComponent"],
                _identification_connexion_connexion_component__WEBPACK_IMPORTED_MODULE_8__["ConnexionComponent"],
                _identification_inscription_inscription_component__WEBPACK_IMPORTED_MODULE_9__["InscriptionComponent"]
            ],
            imports: [
                _angular_platform_browser__WEBPACK_IMPORTED_MODULE_0__["BrowserModule"],
                _app_routing_module__WEBPACK_IMPORTED_MODULE_2__["AppRoutingModule"],
                // Material animation
                _angular_platform_browser_animations__WEBPACK_IMPORTED_MODULE_4__["BrowserAnimationsModule"],
                // Material componet
                _angular_material__WEBPACK_IMPORTED_MODULE_6__["MatButtonModule"],
                _angular_material__WEBPACK_IMPORTED_MODULE_6__["MatCheckboxModule"],
                _angular_material__WEBPACK_IMPORTED_MODULE_6__["MatFormFieldModule"],
                _angular_material__WEBPACK_IMPORTED_MODULE_6__["MatInputModule"],
                _angular_material__WEBPACK_IMPORTED_MODULE_6__["MatSelectModule"],
                _angular_material__WEBPACK_IMPORTED_MODULE_6__["MatIconModule"],
                _angular_material__WEBPACK_IMPORTED_MODULE_6__["MatToolbarModule"],
                _angular_material__WEBPACK_IMPORTED_MODULE_6__["MatSidenavModule"],
                _angular_material__WEBPACK_IMPORTED_MODULE_6__["MatMenuModule"],
                // Flex Layout
                _angular_flex_layout__WEBPACK_IMPORTED_MODULE_5__["FlexLayoutModule"],
                // Forms
                _angular_forms__WEBPACK_IMPORTED_MODULE_7__["FormsModule"],
                _angular_forms__WEBPACK_IMPORTED_MODULE_7__["ReactiveFormsModule"],
                // Http
                _angular_common_http__WEBPACK_IMPORTED_MODULE_10__["HttpClientModule"]
            ],
            providers: [
                _service_config_configuration_service__WEBPACK_IMPORTED_MODULE_12__["ConfigurationService"],
                _service_login_login_service__WEBPACK_IMPORTED_MODULE_11__["LoginService"]
            ],
            bootstrap: [_app_component__WEBPACK_IMPORTED_MODULE_3__["AppComponent"]]
        })
    ], AppModule);
    return AppModule;
}());



/***/ }),

/***/ "./src/app/guard/auth.guard.ts":
/*!*************************************!*\
  !*** ./src/app/guard/auth.guard.ts ***!
  \*************************************/
/*! exports provided: AuthGuard */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "AuthGuard", function() { return AuthGuard; });
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
/* harmony import */ var _angular_router__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! @angular/router */ "./node_modules/@angular/router/fesm5/router.js");
/* harmony import */ var _service_login_login_service__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! ../service/login/login.service */ "./src/app/service/login/login.service.ts");
var __decorate = (undefined && undefined.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (undefined && undefined.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};



var AuthGuard = /** @class */ (function () {
    function AuthGuard(loginService, router) {
        this.loginService = loginService;
        this.router = router;
    }
    AuthGuard.prototype.canActivate = function (next, state) {
        return this.checkLogin();
    };
    AuthGuard.prototype.checkLogin = function () {
        // ne c'est jamais connecter
        if (!this.loginService.isLoggedIn) {
            this.router.navigate(['/connexion']);
            return false;
        }
        // verification de la date
        if (!this.loginService.checkLogedIn()) {
            this.router.navigate(['/connexion']);
            this.loginService.isLoggedIn = false;
            return false;
        }
        return true;
    };
    AuthGuard = __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["Injectable"])({
            providedIn: 'root'
        }),
        __metadata("design:paramtypes", [_service_login_login_service__WEBPACK_IMPORTED_MODULE_2__["LoginService"],
            _angular_router__WEBPACK_IMPORTED_MODULE_1__["Router"]])
    ], AuthGuard);
    return AuthGuard;
}());



/***/ }),

/***/ "./src/app/identification/connexion/connexion.component.css":
/*!******************************************************************!*\
  !*** ./src/app/identification/connexion/connexion.component.css ***!
  \******************************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "\n/*# sourceMappingURL=data:application/json;base64,eyJ2ZXJzaW9uIjozLCJzb3VyY2VzIjpbXSwibmFtZXMiOltdLCJtYXBwaW5ncyI6IiIsImZpbGUiOiJzcmMvYXBwL2lkZW50aWZpY2F0aW9uL2Nvbm5leGlvbi9jb25uZXhpb24uY29tcG9uZW50LmNzcyJ9 */"

/***/ }),

/***/ "./src/app/identification/connexion/connexion.component.html":
/*!*******************************************************************!*\
  !*** ./src/app/identification/connexion/connexion.component.html ***!
  \*******************************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "<div class=\"mui--text-title\">Connexion</div>\n\n<div class=\"mui-container-fluid\">\n    <form [formGroup]=\"connexionForm\" (ngSubmit)=\"onSubmit()\">\n\n        <div class=\"mui-row\">\n            <div class=\"mui-col-md-offset-5 mui-col-md-2\">\n                <mat-form-field>\n                    <input matInput placeholder=\"mail\" formControlName=\"mail\" required>\n                    <mat-error *ngIf=\"form.mail.errors?.required\">\n                        mail is <strong>required</strong>\n                    </mat-error>\n                    <mat-error *ngIf=\"form.mail.errors?.mail\">\n                        mail must be a <strong>valid mail address</strong>\n                    </mat-error>\n                </mat-form-field>\n            </div>\n        </div>\n\n        <div class=\"mui-row\">\n            <div class=\"mui-col-md-offset-5 mui-col-md-2\">\n                <mat-form-field>\n                    <input matInput placeholder=\"password\" [type]=\"hide ? 'password' : 'text'\" formControlName=\"password\" required>\n                    <mat-icon matSuffix (click)=\"hide = !hide\">{{hide ? 'visibility_off' : 'visibility'}}</mat-icon>\n                    <mat-error *ngIf=\"form.mail.errors?.required\">\n                        password is <strong>required</strong>\n                    </mat-error>\n                </mat-form-field>\n            </div>\n        </div>\n\n        <br>\n\n        <div class=\"mui-row\">\n            <div class=\"mui-col-md-offset-5 mui-col-md-2\">\n                <button mat-raised-button color=\"primary\" [disabled]=\"loading\">\n                    Register\n                </button>\n            </div>\n        </div>\n    </form>  \n</div>\n"

/***/ }),

/***/ "./src/app/identification/connexion/connexion.component.ts":
/*!*****************************************************************!*\
  !*** ./src/app/identification/connexion/connexion.component.ts ***!
  \*****************************************************************/
/*! exports provided: ConnexionComponent */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "ConnexionComponent", function() { return ConnexionComponent; });
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
/* harmony import */ var _angular_forms__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! @angular/forms */ "./node_modules/@angular/forms/fesm5/forms.js");
/* harmony import */ var _angular_router__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! @angular/router */ "./node_modules/@angular/router/fesm5/router.js");
/* harmony import */ var src_app_service_login_login_service__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(/*! src/app/service/login/login.service */ "./src/app/service/login/login.service.ts");
var __decorate = (undefined && undefined.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (undefined && undefined.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};
var __awaiter = (undefined && undefined.__awaiter) || function (thisArg, _arguments, P, generator) {
    return new (P || (P = Promise))(function (resolve, reject) {
        function fulfilled(value) { try { step(generator.next(value)); } catch (e) { reject(e); } }
        function rejected(value) { try { step(generator["throw"](value)); } catch (e) { reject(e); } }
        function step(result) { result.done ? resolve(result.value) : new P(function (resolve) { resolve(result.value); }).then(fulfilled, rejected); }
        step((generator = generator.apply(thisArg, _arguments || [])).next());
    });
};
var __generator = (undefined && undefined.__generator) || function (thisArg, body) {
    var _ = { label: 0, sent: function() { if (t[0] & 1) throw t[1]; return t[1]; }, trys: [], ops: [] }, f, y, t, g;
    return g = { next: verb(0), "throw": verb(1), "return": verb(2) }, typeof Symbol === "function" && (g[Symbol.iterator] = function() { return this; }), g;
    function verb(n) { return function (v) { return step([n, v]); }; }
    function step(op) {
        if (f) throw new TypeError("Generator is already executing.");
        while (_) try {
            if (f = 1, y && (t = op[0] & 2 ? y["return"] : op[0] ? y["throw"] || ((t = y["return"]) && t.call(y), 0) : y.next) && !(t = t.call(y, op[1])).done) return t;
            if (y = 0, t) op = [op[0] & 2, t.value];
            switch (op[0]) {
                case 0: case 1: t = op; break;
                case 4: _.label++; return { value: op[1], done: false };
                case 5: _.label++; y = op[1]; op = [0]; continue;
                case 7: op = _.ops.pop(); _.trys.pop(); continue;
                default:
                    if (!(t = _.trys, t = t.length > 0 && t[t.length - 1]) && (op[0] === 6 || op[0] === 2)) { _ = 0; continue; }
                    if (op[0] === 3 && (!t || (op[1] > t[0] && op[1] < t[3]))) { _.label = op[1]; break; }
                    if (op[0] === 6 && _.label < t[1]) { _.label = t[1]; t = op; break; }
                    if (t && _.label < t[2]) { _.label = t[2]; _.ops.push(op); break; }
                    if (t[2]) _.ops.pop();
                    _.trys.pop(); continue;
            }
            op = body.call(thisArg, _);
        } catch (e) { op = [6, e]; y = 0; } finally { f = t = 0; }
        if (op[0] & 5) throw op[1]; return { value: op[0] ? op[1] : void 0, done: true };
    }
};




var ConnexionComponent = /** @class */ (function () {
    function ConnexionComponent(formBuilder, loginService, router) {
        this.formBuilder = formBuilder;
        this.loginService = loginService;
        this.router = router;
        this.hide = true;
        this.loading = false;
    }
    ConnexionComponent.prototype.ngOnInit = function () {
        this.connexionForm = this.formBuilder.group({
            mail: ['', [
                    _angular_forms__WEBPACK_IMPORTED_MODULE_1__["Validators"].required,
                    _angular_forms__WEBPACK_IMPORTED_MODULE_1__["Validators"].email
                ]
            ],
            password: ['', [
                    _angular_forms__WEBPACK_IMPORTED_MODULE_1__["Validators"].required,
                    _angular_forms__WEBPACK_IMPORTED_MODULE_1__["Validators"].minLength(6)
                ]
            ]
        });
    };
    Object.defineProperty(ConnexionComponent.prototype, "form", {
        get: function () { return this.connexionForm.controls; },
        enumerable: true,
        configurable: true
    });
    ConnexionComponent.prototype.onSubmit = function () {
        return __awaiter(this, void 0, void 0, function () {
            var login, res;
            return __generator(this, function (_a) {
                switch (_a.label) {
                    case 0:
                        this.loading = true;
                        // stop here if form is invalid
                        if (this.connexionForm.invalid) {
                            this.loading = false;
                            return [2 /*return*/];
                        }
                        login = this.connexionForm.value;
                        return [4 /*yield*/, this.loginService.connexion(login)];
                    case 1:
                        res = _a.sent();
                        if (res) {
                            this.loginService.isLoggedIn = true;
                            this.loginService.login = login;
                            this.router.navigate(['/inscription']);
                        }
                        // Afficher un message d'erreur dans un cadre rouge
                        console.log(res);
                        this.loading = false;
                        return [2 /*return*/];
                }
            });
        });
    };
    ConnexionComponent = __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["Component"])({
            selector: 'app-connexion',
            template: __webpack_require__(/*! ./connexion.component.html */ "./src/app/identification/connexion/connexion.component.html"),
            styles: [__webpack_require__(/*! ./connexion.component.css */ "./src/app/identification/connexion/connexion.component.css")]
        }),
        __metadata("design:paramtypes", [_angular_forms__WEBPACK_IMPORTED_MODULE_1__["FormBuilder"],
            src_app_service_login_login_service__WEBPACK_IMPORTED_MODULE_3__["LoginService"],
            _angular_router__WEBPACK_IMPORTED_MODULE_2__["Router"]])
    ], ConnexionComponent);
    return ConnexionComponent;
}());



/***/ }),

/***/ "./src/app/identification/inscription/inscription.component.css":
/*!**********************************************************************!*\
  !*** ./src/app/identification/inscription/inscription.component.css ***!
  \**********************************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "\n/*# sourceMappingURL=data:application/json;base64,eyJ2ZXJzaW9uIjozLCJzb3VyY2VzIjpbXSwibmFtZXMiOltdLCJtYXBwaW5ncyI6IiIsImZpbGUiOiJzcmMvYXBwL2lkZW50aWZpY2F0aW9uL2luc2NyaXB0aW9uL2luc2NyaXB0aW9uLmNvbXBvbmVudC5jc3MifQ== */"

/***/ }),

/***/ "./src/app/identification/inscription/inscription.component.html":
/*!***********************************************************************!*\
  !*** ./src/app/identification/inscription/inscription.component.html ***!
  \***********************************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "<div class=\"mui--text-title\">Connexion</div>\n\n<div class=\"mui-container-fluid\">\n    <form [formGroup]=\"connexionForm\" (ngSubmit)=\"onSubmit()\">\n\n        <div class=\"mui-row\">\n            <div class=\"mui-col-md-offset-5 mui-col-md-2\">\n                <mat-form-field>\n                    <input matInput placeholder=\"Email\" formControlName=\"email\" required>\n                    <mat-error *ngIf=\"form.email.errors?.required\">\n                        Email is <strong>required</strong>\n                    </mat-error>\n                    <mat-error *ngIf=\"form.email.errors?.email\">\n                        Email must be a <strong>valid email address</strong>\n                    </mat-error>\n                </mat-form-field>\n            </div>\n        </div>\n\n        <div class=\"mui-row\">\n            <div class=\"mui-col-md-offset-5 mui-col-md-2\">\n                <mat-form-field>\n                    <input matInput placeholder=\"password\" [type]=\"hide ? 'password' : 'text'\" formControlName=\"password\" required>\n                    <mat-icon matSuffix (click)=\"hide = !hide\">{{hide ? 'visibility_off' : 'visibility'}}</mat-icon>\n                    <mat-error *ngIf=\"form.email.errors?.required\">\n                        password is <strong>required</strong>\n                    </mat-error>\n                </mat-form-field>\n            </div>\n        </div>\n\n        <br>\n\n        <div class=\"mui-row\">\n            <div class=\"mui-col-md-offset-5 mui-col-md-2\">\n                <button mat-raised-button color=\"primary\" [disabled]=\"loading\">\n                    Register\n                </button>\n            </div>\n        </div>\n    </form>  \n</div>\n"

/***/ }),

/***/ "./src/app/identification/inscription/inscription.component.ts":
/*!*********************************************************************!*\
  !*** ./src/app/identification/inscription/inscription.component.ts ***!
  \*********************************************************************/
/*! exports provided: InscriptionComponent */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "InscriptionComponent", function() { return InscriptionComponent; });
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
/* harmony import */ var _angular_forms__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! @angular/forms */ "./node_modules/@angular/forms/fesm5/forms.js");
var __decorate = (undefined && undefined.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (undefined && undefined.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};


var InscriptionComponent = /** @class */ (function () {
    function InscriptionComponent(formBuilder) {
        this.formBuilder = formBuilder;
        this.submitted = false;
        this.hide = true;
        this.loading = false;
    }
    InscriptionComponent.prototype.ngOnInit = function () {
        this.connexionForm = this.formBuilder.group({
            email: ['', [
                    _angular_forms__WEBPACK_IMPORTED_MODULE_1__["Validators"].required,
                    _angular_forms__WEBPACK_IMPORTED_MODULE_1__["Validators"].email
                ]
            ],
            password: ['', [
                    _angular_forms__WEBPACK_IMPORTED_MODULE_1__["Validators"].required,
                    _angular_forms__WEBPACK_IMPORTED_MODULE_1__["Validators"].minLength(6)
                ]
            ]
        });
    };
    Object.defineProperty(InscriptionComponent.prototype, "form", {
        get: function () { return this.connexionForm.controls; },
        enumerable: true,
        configurable: true
    });
    InscriptionComponent.prototype.onSubmit = function () {
        this.submitted = true;
        this.loading = true;
        // stop here if form is invalid
        if (this.connexionForm.invalid) {
            return;
        }
        alert('SUCCESS!! :-)');
    };
    InscriptionComponent = __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["Component"])({
            selector: 'app-inscription',
            template: __webpack_require__(/*! ./inscription.component.html */ "./src/app/identification/inscription/inscription.component.html"),
            styles: [__webpack_require__(/*! ./inscription.component.css */ "./src/app/identification/inscription/inscription.component.css")]
        }),
        __metadata("design:paramtypes", [_angular_forms__WEBPACK_IMPORTED_MODULE_1__["FormBuilder"]])
    ], InscriptionComponent);
    return InscriptionComponent;
}());



/***/ }),

/***/ "./src/app/service/config/configuration.service.ts":
/*!*********************************************************!*\
  !*** ./src/app/service/config/configuration.service.ts ***!
  \*********************************************************/
/*! exports provided: ConfigurationService */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "ConfigurationService", function() { return ConfigurationService; });
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
/* harmony import */ var _angular_common_http__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! @angular/common/http */ "./node_modules/@angular/common/fesm5/http.js");
var __decorate = (undefined && undefined.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (undefined && undefined.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};


var ConfigurationService = /** @class */ (function () {
    function ConfigurationService(httpClient) {
        this.httpClient = httpClient;
        this.configUrl = 'assets/config.json';
    }
    ConfigurationService.prototype.getConfig = function () {
        return this.httpClient.get(this.configUrl);
    };
    ConfigurationService = __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["Injectable"])({
            providedIn: 'root'
        }),
        __metadata("design:paramtypes", [_angular_common_http__WEBPACK_IMPORTED_MODULE_1__["HttpClient"]])
    ], ConfigurationService);
    return ConfigurationService;
}());



/***/ }),

/***/ "./src/app/service/login/login.service.ts":
/*!************************************************!*\
  !*** ./src/app/service/login/login.service.ts ***!
  \************************************************/
/*! exports provided: LoginService */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "LoginService", function() { return LoginService; });
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
/* harmony import */ var _angular_common_http__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! @angular/common/http */ "./node_modules/@angular/common/fesm5/http.js");
/* harmony import */ var _config_configuration_service__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! ../config/configuration.service */ "./src/app/service/config/configuration.service.ts");
var __decorate = (undefined && undefined.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (undefined && undefined.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};
var __awaiter = (undefined && undefined.__awaiter) || function (thisArg, _arguments, P, generator) {
    return new (P || (P = Promise))(function (resolve, reject) {
        function fulfilled(value) { try { step(generator.next(value)); } catch (e) { reject(e); } }
        function rejected(value) { try { step(generator["throw"](value)); } catch (e) { reject(e); } }
        function step(result) { result.done ? resolve(result.value) : new P(function (resolve) { resolve(result.value); }).then(fulfilled, rejected); }
        step((generator = generator.apply(thisArg, _arguments || [])).next());
    });
};
var __generator = (undefined && undefined.__generator) || function (thisArg, body) {
    var _ = { label: 0, sent: function() { if (t[0] & 1) throw t[1]; return t[1]; }, trys: [], ops: [] }, f, y, t, g;
    return g = { next: verb(0), "throw": verb(1), "return": verb(2) }, typeof Symbol === "function" && (g[Symbol.iterator] = function() { return this; }), g;
    function verb(n) { return function (v) { return step([n, v]); }; }
    function step(op) {
        if (f) throw new TypeError("Generator is already executing.");
        while (_) try {
            if (f = 1, y && (t = op[0] & 2 ? y["return"] : op[0] ? y["throw"] || ((t = y["return"]) && t.call(y), 0) : y.next) && !(t = t.call(y, op[1])).done) return t;
            if (y = 0, t) op = [op[0] & 2, t.value];
            switch (op[0]) {
                case 0: case 1: t = op; break;
                case 4: _.label++; return { value: op[1], done: false };
                case 5: _.label++; y = op[1]; op = [0]; continue;
                case 7: op = _.ops.pop(); _.trys.pop(); continue;
                default:
                    if (!(t = _.trys, t = t.length > 0 && t[t.length - 1]) && (op[0] === 6 || op[0] === 2)) { _ = 0; continue; }
                    if (op[0] === 3 && (!t || (op[1] > t[0] && op[1] < t[3]))) { _.label = op[1]; break; }
                    if (op[0] === 6 && _.label < t[1]) { _.label = t[1]; t = op; break; }
                    if (t && _.label < t[2]) { _.label = t[2]; _.ops.push(op); break; }
                    if (t[2]) _.ops.pop();
                    _.trys.pop(); continue;
            }
            op = body.call(thisArg, _);
        } catch (e) { op = [6, e]; y = 0; } finally { f = t = 0; }
        if (op[0] & 5) throw op[1]; return { value: op[0] ? op[1] : void 0, done: true };
    }
};



var LoginService = /** @class */ (function () {
    function LoginService(configService, httpClient) {
        var _this = this;
        this.configService = configService;
        this.httpClient = httpClient;
        this.configService.getConfig()
            .subscribe(function (data) {
            _this.config = data;
        });
    }
    LoginService.prototype.connexion = function (login) {
        return __awaiter(this, void 0, void 0, function () {
            return __generator(this, function (_a) {
                return [2 /*return*/, this.httpClient
                        .post(this.config.serveurUrl + this.config.loginUrl, login)
                        .toPromise()
                        .then(function (result) {
                        return result;
                    })
                        .catch(function (error) {
                        console.error('ConnexionService error ', error);
                        return false;
                    })];
            });
        });
    };
    LoginService.prototype.checkLogedIn = function () {
        return __awaiter(this, void 0, void 0, function () {
            return __generator(this, function (_a) {
                return [2 /*return*/, this.httpClient
                        .put(this.config.serveurUrl + this.config.loginUrl + '/' + this.login.mail, null)
                        .toPromise()
                        .then(function (result) {
                        return result;
                    })
                        .catch(function (error) {
                        console.error('ConnexionService error ', error);
                        return false;
                    })];
            });
        });
    };
    LoginService = __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["Injectable"])({
            providedIn: 'root'
        }),
        __metadata("design:paramtypes", [_config_configuration_service__WEBPACK_IMPORTED_MODULE_2__["ConfigurationService"], _angular_common_http__WEBPACK_IMPORTED_MODULE_1__["HttpClient"]])
    ], LoginService);
    return LoginService;
}());



/***/ }),

/***/ "./src/environments/environment.ts":
/*!*****************************************!*\
  !*** ./src/environments/environment.ts ***!
  \*****************************************/
/*! exports provided: environment */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "environment", function() { return environment; });
// This file can be replaced during build by using the `fileReplacements` array.
// `ng build --prod` replaces `environment.ts` with `environment.prod.ts`.
// The list of file replacements can be found in `angular.json`.
var environment = {
    production: false
};
/*
 * For easier debugging in development mode, you can import the following file
 * to ignore zone related error stack frames such as `zone.run`, `zoneDelegate.invokeTask`.
 *
 * This import should be commented out in production mode because it will have a negative impact
 * on performance if an error is thrown.
 */
// import 'zone.js/dist/zone-error';  // Included with Angular CLI.


/***/ }),

/***/ "./src/main.ts":
/*!*********************!*\
  !*** ./src/main.ts ***!
  \*********************/
/*! no exports provided */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
/* harmony import */ var _angular_platform_browser_dynamic__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! @angular/platform-browser-dynamic */ "./node_modules/@angular/platform-browser-dynamic/fesm5/platform-browser-dynamic.js");
/* harmony import */ var _app_app_module__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! ./app/app.module */ "./src/app/app.module.ts");
/* harmony import */ var _environments_environment__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(/*! ./environments/environment */ "./src/environments/environment.ts");
/* harmony import */ var hammerjs__WEBPACK_IMPORTED_MODULE_4__ = __webpack_require__(/*! hammerjs */ "./node_modules/hammerjs/hammer.js");
/* harmony import */ var hammerjs__WEBPACK_IMPORTED_MODULE_4___default = /*#__PURE__*/__webpack_require__.n(hammerjs__WEBPACK_IMPORTED_MODULE_4__);





if (_environments_environment__WEBPACK_IMPORTED_MODULE_3__["environment"].production) {
    Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["enableProdMode"])();
}
Object(_angular_platform_browser_dynamic__WEBPACK_IMPORTED_MODULE_1__["platformBrowserDynamic"])().bootstrapModule(_app_app_module__WEBPACK_IMPORTED_MODULE_2__["AppModule"])
    .catch(function (err) { return console.error(err); });


/***/ }),

/***/ 0:
/*!***************************!*\
  !*** multi ./src/main.ts ***!
  \***************************/
/*! no static exports found */
/***/ (function(module, exports, __webpack_require__) {

module.exports = __webpack_require__(/*! /Users/rlouarn/git/gofootapp-fe/src/main.ts */"./src/main.ts");


/***/ })

},[[0,"runtime","vendor"]]]);
//# sourceMappingURL=main.js.map