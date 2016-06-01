angular.module('columns', [])
  .directive('columnsSeparation', function(){
    var ddo = {};
    ddo.restrict = "AE";
    ddo.transclude = true;
    ddo.scope = {
      columns: '@',
    };
    ddo.template = '<div class="col-md-{{columns}}" ng-transclude></div>';
    return ddo;
  });
