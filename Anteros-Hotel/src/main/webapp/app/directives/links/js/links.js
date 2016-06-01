angular.module('links', [])
  .directive('linkText', function(){
    var ddo = {};
    ddo.restrict = "AE";
    ddo.transclude = true;
    ddo.scope = {
      href: '@'
    };
    ddo.template = '<a class="alert-link" href="{{href}}" ng-transclude></a>';
    return ddo;
  });
