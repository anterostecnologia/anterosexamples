angular.module('rows', [])
  .directive('row', function(){//panel

    var ddo = {};

    ddo.restrict = "AE";
    ddo.transclude = true;

    ddo.templateUrl = appHelper.directiveDir +  '/rows/views/row.html';

    return ddo;

  });
