angular.module('buttons', [])
  .directive('buttonCloseAlert', function(){
    var ddo = {};
    ddo.restrict = "AE";
    ddo.template = '<button type="button" class="close" data-dismiss="alert" aria-hidden="true">&times;</button>';
    return ddo;
  })
  .directive('buttonInfo', function(){
    var ddo = {};
    ddo.restrict = "AE";
    ddo.scope = {
      href: '@',
      name: '@',
      action: '&'
    };
    ddo.template = '<a href="{{href}}" class="btn btn-info btn-wide" ng-click="action()">{{name}}</a>';
    return ddo;
  })
  .directive('buttonInfoChecked', function(){
    var ddo = {};
    ddo.restrict = "AE";
    ddo.scope = {
      href: '@',
      name: '@',
      action: '&'
    };
    ddo.template = '<a href="{{href}}" class="btn btn-info btn-wide" ng-click="action()"><i class="fa fa-check"></i>{{name}}</a>';
    return ddo;
  })
  .directive('buttonPrimary', function(){
    var ddo = {};
    ddo.restrict = "AE";
    ddo.scope = {
      href: '@',
      name: '@',
      action: '&'
    };
    ddo.template = '<a href="{{href}}" class="btn btn-primary btn-wide" ng-click="action()">{{name}}</a>';
    return ddo;
  })
  .directive('buttonPrimaryChecked', function(){
    var ddo = {};
    ddo.restrict = "AE";
    ddo.scope = {
      href: '@',
      name: '@',
      action: '&'
    };
    ddo.template = '<a href="{{href}}" class="btn btn-primary btn-wide" ng-click="action()"><i class="fa fa-check"></i>{{name}}</a>';
    return ddo;
  })
  .directive('buttonDanger', function(){
    var ddo = {};
    ddo.restrict = "AE";
    ddo.scope = {
      href: '@',
      name: '@',
      action: '&'
    };
    ddo.template = '<a href="{{href}}" class="btn btn-danger btn-wide" ng-click="action()">{{name}}</a>';
    return ddo;
  })
  .directive('buttonDangerChecked', function(){
    var ddo = {};
    ddo.restrict = "AE";
    ddo.scope = {
      href: '@',
      name: '@',
      action: '&'
    };
    ddo.template = '<a href="{{href}}" class="btn btn-danger btn-wide" ng-click="action()"><i class="fa fa-check"></i>{{name}}</a>';
    return ddo;
  })
  .directive('buttonWarning', function(){
    var ddo = {};
    ddo.restrict = "AE";
    ddo.scope = {
      href: '@',
      name: '@',
      action: '&'
    };
    ddo.template = '<a href="{{href}}" class="btn btn-warning btn-wide" ng-click="action()">{{name}}</a>';
    return ddo;
  })
  .directive('buttonWarningChecked', function(){
    var ddo = {};
    ddo.restrict = "AE";
    ddo.scope = {
      href: '@',
      name: '@',
      action: '&'
    };
    ddo.template = '<a href="{{href}}" class="btn btn-warning btn-wide" ng-click="action()"><i class="fa fa-check"></i>{{name}}</a>';
    return ddo;
  })
  .directive('buttonSuccess', function(){
    var ddo = {};
    ddo.restrict = "AE";
    ddo.scope = {
      href: '@',
      name: '@',
      action: '&'
    };
    ddo.template = '<a href="{{href}}" class="btn btn-success btn-wide" ng-click="action()">{{name}}</a>';
    return ddo;
  })
  .directive('buttonSuccessChecked', function(){
    var ddo = {};
    ddo.restrict = "AE";
    ddo.scope = {
      href: '@',
      name: '@',
      action: '&'
    };
    ddo.template = '<a href="{{href}}" class="btn btn-success btn-wide" ng-click="action()"><i class="fa fa-check"></i>{{name}}</a>';
    return ddo;
  });
