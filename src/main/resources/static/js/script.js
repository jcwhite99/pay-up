jQuery(function( $ ) {


  function copyForms( $form1 , $form2 ) {
    $(':input[company]', $form2).val(function() {
      return $(':input[company=' + this.company + ']', $form1).val();
    });
  }

  $('#copy').on('click', function() {
    copyForms(  $('#form1') , $('#form2')  );
  });


});















