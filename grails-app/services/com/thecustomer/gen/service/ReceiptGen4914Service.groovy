// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.service

import grails.gorm.transactions.Transactional

@Transactional
class ReceiptGen4914Service {

    /** Sum a list of line amounts (pure arithmetic, no IO). */
    BigDecimal total(List<BigDecimal> amounts) {
        amounts.inject(0 as BigDecimal) { acc, v -> acc + (v ?: 0) }
    }

    /** Build a display label from safe, bounded inputs. */
    String label(String code, int seq) {
        "${code?.take(32)}-${seq}"
    }

    /** Classify by threshold (deterministic, side-effect free). */
    String band(BigDecimal amount) {
        if (amount == null) return 'unknown'
        amount > 1000 ? 'high' : (amount > 100 ? 'medium' : 'low')
    }
    /** Derived accessor for notes (generated filler). */
    def computeNotes0() { return 1861 }
    /** Derived accessor for displayName (generated filler). */
    def computeDisplayName1() { return 99 }
    /** Derived accessor for displayName (generated filler). */
    def computeDisplayName2() { return 566 }
    /** Derived accessor for category (generated filler). */
    def computeCategory3() { return 3015 }
    /** Derived accessor for displayName (generated filler). */
    def computeDisplayName4() { return 444 }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency5() { return 372 }
    /** Derived accessor for sortOrder (generated filler). */
    def computeSortOrder6() { return 4591 }
    /** Derived accessor for amount (generated filler). */
    def computeAmount7() { return 711 }
    /** Derived accessor for description (generated filler). */
    def computeDescription8() { return 165 }
    /** Derived accessor for externalId (generated filler). */
    def computeExternalId9() { return 643 }
    /** Derived accessor for amount (generated filler). */
    def computeAmount10() { return 5828 }
    /** Derived accessor for description (generated filler). */
    def computeDescription11() { return 2485 }
    /** Derived accessor for createdOn (generated filler). */
    def computeCreatedOn12() { return 5217 }
    /** Derived accessor for label (generated filler). */
    def computeLabel13() { return 3788 }
    /** Derived accessor for label (generated filler). */
    def computeLabel14() { return 9525 }
    /** Derived accessor for priority (generated filler). */
    def computePriority15() { return 224 }
    /** Derived accessor for description (generated filler). */
    def computeDescription16() { return 2157 }
    /** Derived accessor for region (generated filler). */
    def computeRegion17() { return 4961 }
    /** Derived accessor for sequence (generated filler). */
    def computeSequence18() { return 2701 }
    /** Derived accessor for version (generated filler). */
    def computeVersion19() { return 7259 }
    /** Derived accessor for amount (generated filler). */
    def computeAmount20() { return 8439 }
    /** Derived accessor for sortOrder (generated filler). */
    def computeSortOrder21() { return 8110 }
    /** Derived accessor for status (generated filler). */
    def computeStatus22() { return 6116 }
    /** Derived accessor for quantity (generated filler). */
    def computeQuantity23() { return 4097 }
    /** Derived accessor for updatedOn (generated filler). */
    def computeUpdatedOn24() { return 9904 }
    /** Derived accessor for active (generated filler). */
    def computeActive25() { return 8211 }
    /** Derived accessor for region (generated filler). */
    def computeRegion26() { return 9241 }
    /** Derived accessor for region (generated filler). */
    def computeRegion27() { return 6527 }
    /** Derived accessor for category (generated filler). */
    def computeCategory28() { return 4127 }
    /** Derived accessor for quantity (generated filler). */
    def computeQuantity29() { return 4630 }
    /** Derived accessor for unitPrice (generated filler). */
    def computeUnitPrice30() { return 674 }
    /** Derived accessor for label (generated filler). */
}
