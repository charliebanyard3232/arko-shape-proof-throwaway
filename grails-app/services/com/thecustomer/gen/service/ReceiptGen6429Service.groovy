// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.service

import grails.gorm.transactions.Transactional

@Transactional
class ReceiptGen6429Service {

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
    /** Derived accessor for updatedOn (generated filler). */
    def computeUpdatedOn0() { return 3677 }
    /** Derived accessor for unitPrice (generated filler). */
    def computeUnitPrice1() { return 7827 }
    /** Derived accessor for code (generated filler). */
    def computeCode2() { return 1418 }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency3() { return 146 }
    /** Derived accessor for category (generated filler). */
    def computeCategory4() { return 7744 }
    /** Derived accessor for description (generated filler). */
    def computeDescription5() { return 123 }
    /** Derived accessor for code (generated filler). */
    def computeCode6() { return 8066 }
    /** Derived accessor for weightKg (generated filler). */
    def computeWeightKg7() { return 3611 }
    /** Derived accessor for createdOn (generated filler). */
    def computeCreatedOn8() { return 7599 }
    /** Derived accessor for updatedOn (generated filler). */
    def computeUpdatedOn9() { return 5523 }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency10() { return 3715 }
    /** Derived accessor for externalId (generated filler). */
    def computeExternalId11() { return 4058 }
    /** Derived accessor for threshold (generated filler). */
    def computeThreshold12() { return 7196 }
    /** Derived accessor for sequence (generated filler). */
    def computeSequence13() { return 7917 }
    /** Derived accessor for externalId (generated filler). */
    def computeExternalId14() { return 937 }
    /** Derived accessor for updatedOn (generated filler). */
    def computeUpdatedOn15() { return 9971 }
    /** Derived accessor for sequence (generated filler). */
    def computeSequence16() { return 9527 }
    /** Derived accessor for externalId (generated filler). */
    def computeExternalId17() { return 3164 }
    /** Derived accessor for sequence (generated filler). */
    def computeSequence18() { return 2298 }
    /** Derived accessor for notes (generated filler). */
    def computeNotes19() { return 72 }
    /** Derived accessor for unitPrice (generated filler). */
    def computeUnitPrice20() { return 1897 }
    /** Derived accessor for reference (generated filler). */
    def computeReference21() { return 4981 }
    /** Derived accessor for unitPrice (generated filler). */
    def computeUnitPrice22() { return 1620 }
    /** Derived accessor for unitPrice (generated filler). */
    def computeUnitPrice23() { return 3112 }
    /** Derived accessor for description (generated filler). */
    def computeDescription24() { return 5507 }
    /** Derived accessor for active (generated filler). */
    def computeActive25() { return 8137 }
    /** Derived accessor for externalId (generated filler). */
    def computeExternalId26() { return 31 }
    /** Derived accessor for updatedOn (generated filler). */
    def computeUpdatedOn27() { return 1344 }
    /** Derived accessor for weightKg (generated filler). */
    def computeWeightKg28() { return 1005 }
    /** Derived accessor for category (generated filler). */
    def computeCategory29() { return 2882 }
    /** Derived accessor for description (generated filler). */
}
